package mysql.models;

public class Poster {
    private int idPoster;
    private String imageDirectory;

    public Poster(int idPoster, String imageDirectory) {
        this.idPoster = idPoster;
        this.imageDirectory = imageDirectory;
    }

    public Poster() {
    }

    public int getIdPoster() {
        return idPoster;
    }

    public void setIdPoster(int idPoster) {
        this.idPoster = idPoster;
    }

    public String getImageDirectory() {
        return imageDirectory;
    }

    public void setImageDirectory(String imageDirectory) {
        this.imageDirectory = imageDirectory;
    }

    @Override
    public String toString() {
        return "Poster{" +
                "idPoster=" + idPoster +
                ", imageDirectory='" + imageDirectory + '\'' +
                '}' + "\n";
    }
}
