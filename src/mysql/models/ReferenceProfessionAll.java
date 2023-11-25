package mysql.models;

import java.util.ArrayList;
import java.util.List;

public class ReferenceProfessionAll {
    private List<ReferenceProfession> referenceProfessionList;

    public ReferenceProfessionAll() {
        this.referenceProfessionList = new ArrayList<>();
    }

    public List<ReferenceProfession> getReferenceProfessionList() {
        return referenceProfessionList;
    }

    public void setReferenceProfessionList(List<ReferenceProfession> referenceProfessionList) {
        this.referenceProfessionList = referenceProfessionList;
    }

    @Override
    public String toString() {
        return "ReferenceProfessionAll{" +
                "referenceProfessionList=" + referenceProfessionList +
                '}' + "\n";
    }
}
