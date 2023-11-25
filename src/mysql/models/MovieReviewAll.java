package mysql.models;

import java.util.ArrayList;
import java.util.List;

public class MovieReviewAll {
    private List<MovieReview> moviesReview;

    public MovieReviewAll() {
        this.moviesReview = new ArrayList<>();
    }

    public List<MovieReview> getMoviesReview() {
        return moviesReview;
    }

    public void setMoviesReview(List<MovieReview> moviesReview) {
        this.moviesReview = moviesReview;
    }

    @Override
    public String toString() {
        return "MovieReviewAll{" +
                "moviesReview=" + moviesReview +
                '}' + "\n";
    }
}
