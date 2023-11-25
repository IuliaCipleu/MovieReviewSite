package mysql.models;

import java.util.ArrayList;
import java.util.List;

public class MovieGenreAll {
    private List<MovieGenre> moviesGenre;

    public MovieGenreAll() {
        this.moviesGenre = new ArrayList<>();
    }

    public List<MovieGenre> getMoviesGenre() {
        return moviesGenre;
    }

    public void setMoviesGenre(List<MovieGenre> moviesGenre) {
        this.moviesGenre = moviesGenre;
    }

    @Override
    public String toString() {
        return "MovieGenreAll{" +
                "moviesGenre=" + moviesGenre +
                '}' + "\n";
    }
}
