import java.util.Objects;

public class Departement
{
    protected int id;
    protected String nomDep;
    protected int numEmp;

    public Departement(int id, String nomDep, int numEmp) {
        this.id = id;
        this.nomDep = nomDep;
        this.numEmp = numEmp;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNomDep(String nomDep) {
        this.nomDep = nomDep;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Departement that = (Departement) o;
        return id == that.id && Objects.equals(nomDep, that.nomDep);
    }

    @Override
    public String toString() {
        return "departement{" +
                "id=" + id +
                ", nomDep='" + nomDep + '\'' +
                ", numEmp=" + numEmp +
                '}';
    }

    public void setNumEmp(int numEmp) {
        this.numEmp = numEmp;
    }

    public int getId() {
        return id;
    }

    public String getNomDep() {
        return nomDep;
    }

    public int getNumEmp() {
        return numEmp;
    }

    public Departement()
    {

    }

}
