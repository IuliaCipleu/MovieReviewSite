package mysql.models;

public class ReferenceMovieGenre {
    private int idReferenceMovieGenre;
    private String nameGenre;

    public ReferenceMovieGenre(int idReferenceMovieGenre, String nameGenre) {
        this.idReferenceMovieGenre = idReferenceMovieGenre;
        this.nameGenre = nameGenre;
    }

    public ReferenceMovieGenre() {
    }

    public int getIdReferenceMovieGenre() {
        return idReferenceMovieGenre;
    }

    public void setIdReferenceMovieGenre(int idReferenceMovieGenre) {
        this.idReferenceMovieGenre = idReferenceMovieGenre;
    }

    public String getNameGenre() {
        return nameGenre;
    }

    public void setNameGenre(String nameGenre) {
        this.nameGenre = nameGenre;
    }

    @Override
    public String toString() {
        return "ReferenceMovieGenre{" +
                "idReferenceMovieGenre=" + idReferenceMovieGenre +
                ", nameGenre='" + nameGenre + '\'' +
                '}' + "\n";
    }
}
