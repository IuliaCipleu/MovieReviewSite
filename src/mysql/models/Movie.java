package mysql.models;

import java.math.BigDecimal;
import java.util.Date;

public class Movie {
    private int order;
    private String nameMovie;
    private BigDecimal starRating;
    private Date releaseDate;
    private int idPoster;

    public Movie(int order, String nameMovie, BigDecimal starRating, Date releaseDate, int idPoster) {
        this.order = order;
        this.nameMovie = nameMovie;
        this.starRating = starRating;
        this.releaseDate = releaseDate;
        this.idPoster = idPoster;
    }

    public Movie() {
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public String getNameMovie() {
        return nameMovie;
    }

    public void setNameMovie(String nameMovie) {
        this.nameMovie = nameMovie;
    }

    public BigDecimal getStarRating() {
        return starRating;
    }

    public void setStarRating(BigDecimal starRating) {
        this.starRating = starRating;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getIdPoster() {
        return idPoster;
    }

    public void setIdPoster(int idPoster) {
        this.idPoster = idPoster;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "nameMovie='" + nameMovie + ',' + '\'' +
                " starRating=" + starRating + ',' +
                " releaseDate=" + releaseDate +
                '}' + "\n";
    }
}
