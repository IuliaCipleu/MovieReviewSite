package mysql.models;

import java.util.ArrayList;
import java.util.List;

public class MovieCastAll {
    private List<MovieCast> moviesCast;

    public MovieCastAll() {
        this.moviesCast = new ArrayList<>();
    }

    public List<MovieCast> getMoviesCast() {
        return moviesCast;
    }

    public void setMoviesCast(List<MovieCast> moviesCast) {
        this.moviesCast = moviesCast;
    }

    @Override
    public String toString() {
        return moviesCast + " ";
    }
}