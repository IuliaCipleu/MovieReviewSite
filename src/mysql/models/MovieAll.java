package mysql.models;

import java.util.ArrayList;
import java.util.List;

public class MovieAll {
    private List<Movie> movies;

    public MovieAll() {
        this.movies = new ArrayList<>();
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }

    @Override
    public String toString() {
        return movies + "\n";
    }
}