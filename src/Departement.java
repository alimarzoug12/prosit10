import java.util.Objects;

public class Departement {
    private int id;
    private String nomDep;
    private int nbrEmp;

    public Departement(){

    }
    public Departement(int id, String nomDep, int nbrEmp){
        this.id=id;
        this.nomDep = nomDep;
        this.nbrEmp = nbrEmp;
    }

    public int getId(){
        return id;
    }

    @Override
    public String toString() {
        return "Departement{" +
                "id=" + id +
                ", nomDep='" + nomDep + '\'' +
                ", nbrEmp=" + nbrEmp +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Departement that = (Departement) o;
        return id == that.id && nbrEmp == that.nbrEmp && Objects.equals(nomDep, that.nomDep);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nomDep, nbrEmp);
    }

    public void setNomDep(String nomDep) {
        this.nomDep = nomDep;
    }

    public void setNbrEmp(int nbrEmp) {
        this.nbrEmp = nbrEmp;
    }

    public String getNomDep() {
        return nomDep;
    }

    public int getNbrEmp() {
        return nbrEmp;
    }

    public void setId(int id){
        this.id = id;
    }


}
