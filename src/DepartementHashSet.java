import com.sun.source.tree.Tree;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class DepartementHashSet implements IDepartement{


        private Set<Departement> departments;

        public DepartementHashSet() {
            departments = new HashSet<>();
        }


    @Override
    public void ajouterDepartement(Object o) {
        departments.add((Departement) o);
    }

    @Override
        public boolean rechercherDepartement(String nom) {
            for (Departement department : departments) {
                if (department.getNomDep().equals(nom)) {
                    return true;
                }
            }
            return false;
        }

    @Override
    public boolean rechercherDepartement(Object o) {
        return departments.contains((Departement) o);
    }

    @Override
    public void supprimerDepartement(Object o) {
        departments.remove((Departement) o);

    }



        @Override
        public void displayDepartement() {
            for (Departement dp : departments) {
                System.out.println(dp.toString());
            }
        }

        @Override
        public TreeSet<Departement> trierDepartementById(DepartementComparator c) {
            TreeSet<Departement> s = new TreeSet<>(c);
            s.addAll(departments);
            return s;
        }
}
