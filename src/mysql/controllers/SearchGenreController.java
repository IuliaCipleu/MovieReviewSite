package mysql.controllers;

import mysql.DatabaseConnection;
import mysql.models.MovieAll;
import mysql.views.SearchGenreView;

public class SearchGenreController {
    private SearchGenreView view;
    private MovieAll movies;
    private DatabaseConnection databaseConnection;

    public SearchGenreController(SearchGenreView view, MovieAll movies, DatabaseConnection databaseConnection, String genre, MovieAll movieThisGenre) {
        this.view = view;
        this.movies = movies;
        this.databaseConnection = databaseConnection;
        this.view.setTitlePane(genre);
        this.view.setMoviesTextPane(movieThisGenre.toString());
    }
}