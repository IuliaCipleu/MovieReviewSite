package mysql.models;

import java.util.ArrayList;
import java.util.List;

public class CastAll {
    private List<Cast> cast;

    public CastAll() {
        this.cast = new ArrayList<>();
    }

    public List<Cast> getCast() {
        return cast;
    }

    public void setCast(List<Cast> cast) {
        this.cast = cast;
    }

    @Override
    public String toString() {
        return "CastAll{" +
                "cast=" + cast +
                '}' + "\n";
    }
}
