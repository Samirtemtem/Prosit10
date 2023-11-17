import java.util.Comparator;

public class DepartementComparator implements Comparator<Departement> {

    @Override
    public int compare(Departement o1, Departement o2) {
        if (o1.getId()==o2.getId())
            return 0;
        if (o1.getId()>o2.getId())
            return 1;
        if (o1.getId()<o2.getId())
            return -1;
        return 0;
    }
}