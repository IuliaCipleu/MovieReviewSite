package mysql.models;

public class Cast {
    private int idPerson;
    private String namePerson;

    public Cast(int idPerson, String namePerson) {
        this.idPerson = idPerson;
        this.namePerson = namePerson;
    }

    public Cast() {
    }

    public int getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(int idPerson) {
        this.idPerson = idPerson;
    }

    public String getNamePerson() {
        return namePerson;
    }

    public void setNamePerson(String namePerson) {
        this.namePerson = namePerson;
    }

    @Override
    public String toString() {
        return "Cast{" +
                "id=" + idPerson +
                " name'" + namePerson + '\'' +
                '}' + "\n";
    }
}
