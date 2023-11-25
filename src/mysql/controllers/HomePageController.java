package mysql.controllers;

import mysql.DatabaseConnection;
import mysql.models.*;
import mysql.views.HomePageView;
import mysql.views.SearchByNameView;
import mysql.views.SearchGenreView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class HomePageController {
    private HomePageView view;
    private MovieAll movie;
    private DatabaseConnection databaseConnection;

    public HomePageController(HomePageView view, MovieAll movie, DatabaseConnection databaseConnection) {
        this.view = view;
        this.movie = movie;
        this.databaseConnection = databaseConnection;
        this.view.showTodayMovie(new SelectListener());
        this.view.showMovieByName(new GoToMovie());
        this.view.selectGenre(new GoToGenre());
        this.view.createAccount(new NewAccount());
    }

    class SelectListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                Connection connection = databaseConnection.getConnection();
                String sql = "SELECT * FROM movie";
                Statement statement = connection.createStatement();
                ResultSet result = statement.executeQuery(sql);
                movie.getMovies().clear();
                while (result.next()) {
                    int order = result.getInt(1); //specif coloana
                    String nameMovie = result.getString(2);
                    BigDecimal starRating = result.getBigDecimal(3);
                    Date releaseDate = result.getDate(4);
                    java.util.Date utilDate = new java.util.Date(releaseDate.getTime());
                    int idPoster = result.getInt(5);
                    if (releaseDate.getMonth() == (java.time.LocalDate.now().getMonthValue() - 1) && releaseDate.getDate() == java.time.LocalDate.now().getDayOfMonth()) {
                        movie.getMovies().add(new Movie(order, nameMovie, starRating, releaseDate, idPoster));
                    }
                }
                view.setTodayMoviesTextPane(movie.getMovies().toString());
                connection.close();
            } catch (Exception ex) {
                view.showErrorMessage("Something went wrong!");
                ex.printStackTrace();
            }
        }
    }

    class GoToMovie implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                Connection connection = databaseConnection.getConnection();
                String searchFor = view.getSearchMovieTextField();
                boolean found = false;
                String sql = "SELECT * FROM movie";
                Statement statement = connection.createStatement();
                ResultSet result = statement.executeQuery(sql);
                while (result.next() && !found) {
                    int order = result.getInt(1); //specif coloana
                    String nameMovie = result.getString(2);
                    BigDecimal starRating = result.getBigDecimal(3);
                    Date releaseDate = result.getDate(4);
                    int idPoster = result.getInt(5);
                    String poster = "";
                    PreparedStatement sql4 = connection.prepareStatement("select * from project_imdb.poster where project_imdb.poster.id_posters =?");
                    sql4.setInt(1, idPoster);
                    ResultSet result4 = sql4.executeQuery();
                    String genre = "";
                    if (result4.next()) {
                        poster = result4.getString(2);
                    }
                    MovieCastAll actors = new MovieCastAll();
                    MovieCastAll directors = new MovieCastAll();
                    MovieCastAll writers = new MovieCastAll();
                    if (nameMovie.equals(searchFor)) {
                        found = true;
                        view.showMessage("Movie Found!");
                        //view.dispose();
                        PreparedStatement sql2 = connection.prepareStatement("select * from project_imdb.movie_genre where id_movie=?");
                        sql2.setInt(1, order);
                        ResultSet result2 = sql2.executeQuery();
                        if (result2.next()) {
                            int idGenre;
                            idGenre = result2.getInt(2);
                            PreparedStatement sql3 = connection.prepareStatement("select * from project_imdb.ref_movie_genre where id_ref_movie_genres=?");
                            sql3.setInt(1, idGenre);
                            ResultSet result3 = sql3.executeQuery();
                            if (result3.next()) {
                                genre = result3.getString(2);
                            }
                        }
                        PreparedStatement sql5 = connection.prepareStatement("select * from movie_cast where  movie_cast.name_movie like ?");
                        sql5.setString(1, nameMovie);
                        ResultSet result5 = sql5.executeQuery();
                        while (result5.next()) {
                            int idWorker = result5.getInt(1);
                            int codeJob = result5.getInt(3);
                            PreparedStatement sql6 = connection.prepareStatement("select * from cast where id_person = ?");
                            sql6.setInt(1, idWorker);
                            ResultSet result6 = sql6.executeQuery();
                            while (result6.next()) {
                                String namePerson = result6.getString(2);
                                if (codeJob == 1) {
                                    actors.getMoviesCast().add(new MovieCast(idWorker, namePerson, codeJob));
                                }
                                if (codeJob == 2) {
                                    directors.getMoviesCast().add(new MovieCast(idWorker, namePerson, codeJob));
                                }
                                if (codeJob == 3) {
                                    writers.getMoviesCast().add(new MovieCast(idWorker, namePerson, codeJob));
                                }
                                if (codeJob == 4) {
                                    directors.getMoviesCast().add(new MovieCast(idWorker, namePerson, codeJob));
                                    writers.getMoviesCast().add(new MovieCast(idWorker, namePerson, codeJob));
                                }
                            }
                        }
                        SearchByNameView view2 = new SearchByNameView();
                        MovieReviewAll movieReviewAll = new MovieReviewAll();
                        ReviewerAll reviewers = new ReviewerAll();
                        ReferenceStarRatingAll referenceStarRatingAll = new ReferenceStarRatingAll();
                        SearchByNameController searchByNameController = new SearchByNameController(view2, movie, movieReviewAll, reviewers, referenceStarRatingAll, databaseConnection,
                                nameMovie, genre, releaseDate, starRating, poster, actors, directors, writers);
                    }
                }
                if (found == false) {
                    view.showErrorMessage("Movie not found!");
                }
                connection.close();
            } catch (Exception exception) {
                view.showErrorMessage("Bad input!");
            }
        }
    }

    class GoToGenre implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                Connection connection = databaseConnection.getConnection();
                PreparedStatement sql = connection.prepareStatement("select * from project_imdb.ref_movie_genre where name_genre like ?");
                sql.setString(1, view.getGenreComboBox());
                ResultSet result = sql.executeQuery();
                MovieAll movieAll = new MovieAll();
                List<Movie> movieAll2 = new ArrayList<>();
                while (result.next()) {
                    int idRefGenre = result.getInt(1);
                    PreparedStatement sql2 = connection.prepareStatement("select * from movie_genre where id_genre = ?");
                    sql2.setInt(1, idRefGenre);
                    ResultSet result2 = sql2.executeQuery();
                    while (result2.next()) {
                        int idMovie = result2.getInt(1);
                        PreparedStatement sql3 = connection.prepareStatement("select * from movie where movie.order = ?");
                        sql3.setInt(1, idMovie);
                        ResultSet result3 = sql3.executeQuery();
                        while (result3.next()) {
                            movieAll.getMovies().add(new Movie(result3.getInt(1), result3.getString(2), result3.getBigDecimal(3), result3.getDate(4), result3.getInt(5)));
                            movieAll2.add(new Movie(result3.getInt(1), result3.getString(2), result3.getBigDecimal(3), result3.getDate(4), result3.getInt(5)));
                        }
                    }
                }
                SearchGenreView view2 = new SearchGenreView(movieAll2);
                SearchGenreController searchGenreController = new SearchGenreController(view2, movie, databaseConnection, view.getGenreComboBox(), movieAll);
                connection.close();
            } catch (Exception exception) {
                view.showErrorMessage("Bad input!");
            }
        }
    }

    class NewAccount implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                if (view.getEmailTextField().indexOf('@') <= 0 || view.getPasswordTextField().isEmpty() || view.getEmailTextField().indexOf('.') <= 0) {
                    view.showErrorMessage("Bad input!");
                    view.refresh();
                } else {
                    Connection connection = databaseConnection.getConnection();
                    String sql = "SELECT * FROM project_imdb.reviewer";
                    Statement statement = connection.createStatement();
                    ResultSet result = statement.executeQuery(sql);
                    boolean alreadyExists = false;
                    String password = null;
                    while (result.next() && !alreadyExists) {
                        if (result.getString(2).equals(view.getEmailTextField())) {
                            alreadyExists = true;
                            password = result.getString(4);
                        }
                    }
                    if (alreadyExists) {
                        //System.out.println(password);
                        if (password.equals(view.getPasswordTextField())) {
                            PreparedStatement sql2 = connection.prepareStatement("DELETE FROM project_imdb.reviewer WHERE email_address like ?");
                            sql2.setString(1, view.getEmailTextField());
                            sql2.executeUpdate();
                            view.showMessage("Account successfully deleted!");
                        } else {
                            view.showErrorMessage("Incorrect Password!");
                        }
                    } else {
                        PreparedStatement preparedStatement = connection.prepareStatement("insert into reviewer (email_address, password)" + "values (?, ?)");
                        preparedStatement.setString(1, view.getEmailTextField());
                        preparedStatement.setString(2, view.getPasswordTextField());
                        preparedStatement.executeUpdate();
                        view.showMessage("Account successfully created!");
                    }
                    connection.close();
                }
            } catch (Exception exception) {
                view.showErrorMessage("Bad input!");
            }
        }
    }
}