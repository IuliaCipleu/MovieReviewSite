package mysql.models;

public class ReferenceStarRating {
    private int id;
    private double value;

    public ReferenceStarRating(int id, double value) {
        this.id = id;
        this.value = value;
    }

    public ReferenceStarRating() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "ReferenceStarRating{" +
                "id=" + id +
                ", value=" + value +
                '}' + "\n";
    }
}
