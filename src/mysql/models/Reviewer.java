package mysql.models;

public class Reviewer {
    private int idReviewer;
    private String emailAddress;
    private int numberReviews;

    public Reviewer(int idReviewer, String emailAddress, int numberReviews) {
        this.idReviewer = idReviewer;
        this.emailAddress = emailAddress;
        this.numberReviews = numberReviews;
    }

    public Reviewer() {
    }

    public int getIdReviewer() {
        return idReviewer;
    }

    public void setIdReviewer(int idReviewer) {
        this.idReviewer = idReviewer;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public int getNumberReviews() {
        return numberReviews;
    }

    public void setNumberReviews(int numberReviews) {
        this.numberReviews = numberReviews;
    }

    @Override
    public String toString() {
        return "Reviewer{" +
                "idReviewer=" + idReviewer +
                ", emailAddress='" + emailAddress + '\'' +
                ", numberReviews=" + numberReviews +
                '}' + "\n";
    }
}
