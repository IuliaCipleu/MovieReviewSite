package mysql.models;

public class MovieGenre {
    private int idMovie;
    private int idGenre;

    public MovieGenre(int idMovie, int idGenre) {
        this.idMovie = idMovie;
        this.idGenre = idGenre;
    }

    public MovieGenre() {
    }

    public int getIdMovie() {
        return idMovie;
    }

    public void setIdMovie(int idMovie) {
        this.idMovie = idMovie;
    }

    public int getIdGenre() {
        return idGenre;
    }

    public void setIdGenre(int idGenre) {
        this.idGenre = idGenre;
    }

    @Override
    public String toString() {
        return "MovieGenre{" +
                "idMovie=" + idMovie +
                ", idGenre=" + idGenre +
                '}' + "\n";
    }
}
