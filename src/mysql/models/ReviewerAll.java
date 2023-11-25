package mysql.models;

import java.util.ArrayList;
import java.util.List;

public class ReviewerAll {
    private List<Reviewer> reviewers;

    public ReviewerAll() {
        this.reviewers = new ArrayList<>();
    }

    public List<Reviewer> getReviewers() {
        return reviewers;
    }

    public void setReviewers(List<Reviewer> reviewers) {
        this.reviewers = reviewers;
    }

    @Override
    public String toString() {
        return "ReviewerAll{" +
                "reviewers=" + reviewers +
                '}' + "\n";
    }
}
