package mysql.models;

import java.util.ArrayList;
import java.util.List;

public class ReferenceStarRatingAll {
    private List<ReferenceStarRating> referenceStarRatingList;

    public ReferenceStarRatingAll() {
        this.referenceStarRatingList = new ArrayList<>();
    }

    public List<ReferenceStarRating> getReferenceStarRatingList() {
        return referenceStarRatingList;
    }

    public void setReferenceStarRatingList(List<ReferenceStarRating> referenceStarRatingList) {
        this.referenceStarRatingList = referenceStarRatingList;
    }

    @Override
    public String toString() {
        return "ReferenceStarRatingAll{" +
                "referenceStarRatingList=" + referenceStarRatingList +
                '}' + "\n";
    }
}
