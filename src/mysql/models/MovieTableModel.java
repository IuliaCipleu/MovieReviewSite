package mysql.models;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;

public class MovieTableModel extends AbstractTableModel {

    // am luat aici o lista de produse ca acestea vrem sa le afisam pe tabel
    private List<Movie> moviesList = new ArrayList<>();

    // si trebuie sa facem override la niste metode specifice lui AbstractTableModel
    // rowCount? well asta e easy, ca e direct size-ul listei de produse declarate mai sus
    @Override
    public int getRowCount() {
        return moviesList.size();
    }

    // well, columnCount la fel ii easy, ca gen stim cate coloane o sa fie, ca le-am definit in columnNamesProducts
    @Override
    public int getColumnCount() {
        return 5;
    }

    // practic spunem ce se gaseste pe fiecare rand, la fiecare coloana
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        // se ia randul curent
        Movie currentMovie = (Movie) moviesList.toArray()[rowIndex];
        switch (columnIndex) { // si mergem pe coloane pe rand
            case 0:
                return currentMovie.getOrder();
            case 1:
                return currentMovie.getNameMovie();
            case 2:
                return currentMovie.getStarRating();
            case 3:
                return currentMovie.getReleaseDate();
            case 4:
                return currentMovie.getIdPoster();
        }
        return null;
    }

    // asta am facut-o ca sa setez lista de produse din ProductTableModel pentru ca am declarat-o private
    public void setMoviess(List<Movie> moviesList) {
        this.moviesList = moviesList;
    }
}
