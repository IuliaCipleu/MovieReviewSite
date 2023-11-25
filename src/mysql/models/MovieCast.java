package mysql.models;

public class MovieCast {
    private int idWorker;
    private String nameMovie;
    private int codeJob;

    public MovieCast(int idWorker, String nameMovie, int codeJob) {
        this.idWorker = idWorker;
        this.nameMovie = nameMovie;
        this.codeJob = codeJob;
    }

    public MovieCast() {
    }

    public int getIdWorker() {
        return idWorker;
    }

    public void setIdWorker(int idWorker) {
        this.idWorker = idWorker;
    }

    public String getNameMovie() {
        return nameMovie;
    }

    public void setNameMovie(String nameMovie) {
        this.nameMovie = nameMovie;
    }

    public int getCodeJob() {
        return codeJob;
    }

    public void setCodeJob(int codeJob) {
        this.codeJob = codeJob;
    }

    @Override
    public String toString() {
        return nameMovie + "\n";
    }
}