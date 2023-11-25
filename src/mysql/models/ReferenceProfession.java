package mysql.models;

public class ReferenceProfession {
    private int idReferenceProfession;
    private String nameProfession;

    public ReferenceProfession(int idReferenceProfession, String nameProfession) {
        this.idReferenceProfession = idReferenceProfession;
        this.nameProfession = nameProfession;
    }

    public ReferenceProfession() {
    }

    public int getIdReferenceProfession() {
        return idReferenceProfession;
    }

    public void setIdReferenceProfession(int idReferenceProfession) {
        this.idReferenceProfession = idReferenceProfession;
    }

    public String getNameProfession() {
        return nameProfession;
    }

    public void setNameProfession(String nameProfession) {
        this.nameProfession = nameProfession;
    }

    @Override
    public String toString() {
        return "ReferenceProfession{" +
                "idReferenceProfession=" + idReferenceProfession +
                ", nameProfession='" + nameProfession + '\'' +
                '}' + "\n";
    }
}
