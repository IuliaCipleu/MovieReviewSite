package mysql.models;

public class MovieReview {
    private int order;
    private int movie_id;
    private String reviewerEmail;
    private double stars;

    public MovieReview(int order, int movie_id, String reviewerEmail, double stars) {
        this.order = order;
        this.movie_id = movie_id;
        this.reviewerEmail = reviewerEmail;
        this.stars = stars;
    }

    public MovieReview() {
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public int getMovie_id() {
        return movie_id;
    }

    public void setMovie_id(int movie_id) {
        this.movie_id = movie_id;
    }

    public String getReviewerEmail() {
        return reviewerEmail;
    }

    public void setReviewerEmail(String reviewerEmail) {
        this.reviewerEmail = reviewerEmail;
    }

    public double getStars() {
        return stars;
    }

    public void setStars(double stars) {
        this.stars = stars;
    }

    @Override
    public String toString() {
        return "MovieReview{" +
                "order=" + order +
                ", movie_id=" + movie_id +
                ", reviewerEmail='" + reviewerEmail + '\'' +
                ", stars=" + stars +
                '}' + "\n";
    }
}
