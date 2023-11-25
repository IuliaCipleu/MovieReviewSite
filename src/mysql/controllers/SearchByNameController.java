package mysql.controllers;

import mysql.DatabaseConnection;
import mysql.models.*;
import mysql.views.SearchByNameView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.sql.*;

public class SearchByNameController {
    private SearchByNameView view;
    private MovieAll movies;
    private MovieReviewAll movieReviewAll;
    private ReviewerAll reviewers;
    private ReferenceStarRatingAll referenceStarRatingAll;
    private DatabaseConnection databaseConnection;

    public SearchByNameController(SearchByNameView view, MovieAll movies, MovieReviewAll movieReviewAll, ReviewerAll reviewers, ReferenceStarRatingAll referenceStarRatingAll, DatabaseConnection databaseConnection,
                                  String title, String genre, Date date, BigDecimal star, String poster, MovieCastAll actors, MovieCastAll directors, MovieCastAll writers) {
        this.view = view;
        this.movies = movies;
        this.movieReviewAll = movieReviewAll;
        this.reviewers = reviewers;
        this.referenceStarRatingAll = referenceStarRatingAll;
        this.databaseConnection = databaseConnection;
        this.view.submitReview(new InsertListener());
        this.view.setTitleTextArea(title);
        this.view.setGenreTextArea(genre);
        this.view.setDateTextArea(String.valueOf(date));
        this.view.setStarTextArea(star);
        this.view.setPosterLabel(poster);
        this.view.setActorTextArea(actors.toString());
        this.view.setDirectorTextArea(directors.toString());
        this.view.setWriterTextArea(writers.toString());
    }

    class InsertListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                movies.getMovies().clear();
                // facem o conexiune spre baza noastra de date
                Connection connection = databaseConnection.getConnection();
                PreparedStatement sql2 = connection.prepareStatement("select * from reviewer where email_address like ?");
                sql2.setString(1, view.getEmailTextField());
                ResultSet result2 = sql2.executeQuery();
                boolean found = false;
                while (result2.next()) {
                    found = true;
                    if (result2.getString(4).equals(view.getPasswordField())) {
                        PreparedStatement sql = connection.prepareStatement("select * from project_imdb.movie where project_imdb.movie.nameMovies LIKE ?");
                        //System.out.println(view.getTitleTextArea());
                        sql.setString(1, view.getTitleTextArea());
                        ResultSet result = sql.executeQuery();
                        if (result.next()) {
                            PreparedStatement sql3 = connection.prepareStatement("SELECT * FROM movie_review WHERE movie_id = ? and reviewer_email like ?;");
                            sql3.setInt(1, result.getInt(1));
                            sql3.setString(2, view.getEmailTextField());
                            ResultSet result3 = sql3.executeQuery();
                            if (result3.next()) {
                                view.showErrorMessage("Already reviewed!");
                            } else {
                                PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO project_imdb.movie_review (movie_id, reviewer_email, stars) VALUES (?, ?, ?);");
                                preparedStatement.setInt(1, result.getInt(1));
                                preparedStatement.setString(2, view.getEmailTextField());
                                preparedStatement.setBigDecimal(3, view.getReviewTextField());
                                preparedStatement.executeUpdate();
                                view.showMessage("Review submited!");

                                Statement statement = connection.createStatement();
                                Statement statement2 = connection.createStatement();
                                String sql4 = " UPDATE project_imdb.movie SET project_imdb.movie.star_rating = (SELECT  AVG(project_imdb.movie_review.stars) FROM project_imdb.movie_review WHERE project_imdb.movie_review.movie_id = project_imdb.movie.order);";
                                statement.executeUpdate(sql4);
                                PreparedStatement sql5 = connection.prepareStatement("select * from project_imdb.movie where project_imdb.movie.nameMovies LIKE ?");
                                sql5.setString(1, view.getTitleTextArea());
                                ResultSet result4 = sql5.executeQuery();
                                while (result4.next()) {
                                    view.setStarTextArea(result4.getBigDecimal(3));
                                }
                                String sql6 = " UPDATE project_imdb.reviewer SET project_imdb.reviewer.number_reviews = (SELECT  Count(project_imdb.movie_review.reviewer_email) FROM project_imdb.movie_review WHERE project_imdb.movie_review.reviewer_email = project_imdb.reviewer.email_address);";
                                statement.executeUpdate(sql6);
                                PreparedStatement sql7 = connection.prepareStatement("select * from project_imdb.reviewer where project_imdb.reviewer.email_address LIKE ?");
                                sql7.setString(1, view.getEmailTextField());
                                ResultSet result5 = sql7.executeQuery();
                                while (result5.next()) {
                                    view.showMessage("This is review number " + result5.getInt(3));
                                }
                                view.refresh();
                            }

                        } else {
                            view.showErrorMessage("Error");
                        }
                    } else {
                        view.showErrorMessage("Incorrect Password!");
                    }
                }
                if (found == false) {
                    view.showErrorMessage("Non existent account!");
                }
                connection.close();
            } catch (Exception ex) {
                view.showErrorMessage("Bad input!");
            }
        }
    }
}