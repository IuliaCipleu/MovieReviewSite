package mysql.models;

import java.util.ArrayList;
import java.util.List;

public class ReferenceMovieGenreAll {
    private List<ReferenceMovieGenre> referenceMovieGenreList;

    public ReferenceMovieGenreAll() {
        this.referenceMovieGenreList = new ArrayList<>();
    }

    public List<ReferenceMovieGenre> getReferenceMovieGenreList() {
        return referenceMovieGenreList;
    }

    public void setReferenceMovieGenreList(List<ReferenceMovieGenre> referenceMovieGenreList) {
        this.referenceMovieGenreList = referenceMovieGenreList;
    }

    @Override
    public String toString() {
        return "ReferenceMovieGenreAll{" +
                "referenceMovieGenreList=" + referenceMovieGenreList +
                '}' + "\n";
    }
}
