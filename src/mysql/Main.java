package mysql;

import mysql.controllers.HomePageController;
import mysql.models.MovieAll;
import mysql.models.MovieReviewAll;
import mysql.models.ReferenceStarRatingAll;
import mysql.models.ReviewerAll;
import mysql.views.HomePageView;

public class Main {
    public static void main(String[] args) {
        //System.out.println(java.time.LocalDate.now().getMonthValue() + " " +  java.time.LocalDate.now().getDayOfMonth());
        MovieAll movie = new MovieAll();
        MovieReviewAll movieReviewAll = new MovieReviewAll();
        ReviewerAll reviewers = new ReviewerAll();
        ReferenceStarRatingAll referenceStarRatingAll = new ReferenceStarRatingAll();
        HomePageView view = new HomePageView();
        //SearchByNameView view2 = new SearchByNameView();
        DatabaseConnection databaseConnection = new DatabaseConnection();
        HomePageController homePageController = new HomePageController(view, movie, databaseConnection);
        //SearchByNameController searchByNameController = new SearchByNameController(view2, movie, movieReviewAll, reviewers, referenceStarRatingAll, databaseConnection);
    }
}
