package mysql.models;

import java.util.ArrayList;
import java.util.List;

public class PosterAll {
    private List<Poster> posters;

    public PosterAll() {
        this.posters = new ArrayList<>();
    }

    public List<Poster> getPosters() {
        return posters;
    }

    public void setPosters(List<Poster> posters) {
        this.posters = posters;
    }

    @Override
    public String toString() {
        return "PosterAll{" +
                "posters=" + posters +
                '}' + "\n";
    }
}
