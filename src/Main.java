import java.util.TreeSet;

public class Main {
    public static void main(String[] args)
    {
        DepartementHashSet departementHashSet=new DepartementHashSet();
        Departement department1 = new Departement(1, "Human Resources", 10);
        Departement department2 = new Departement(2, "Finance", 15);
        Departement department3 = new Departement(3, "Marketing", 12);

        departementHashSet.ajouterDepartement(department1);
        departementHashSet.ajouterDepartement(department2);
        departementHashSet.ajouterDepartement(department3);

        System.out.println("All departments:");
        departementHashSet.displayDepartement();
        System.out.println();

        String searchName = "Finance";
        boolean isFound = departementHashSet.rechercherDepartement(searchName);
        System.out.println("Search Result (by name): " + (isFound ? "Found" : "Not Found"));
        System.out.println();

        Departement searchDepartment = new Departement(2, "Finance", 15);
        isFound = departementHashSet.rechercherDepartement(searchDepartment);
        System.out.println("Search Result (by new finance object with the same attributes): " + (isFound ? "Found" : "Not Found"));
        System.out.println();
        isFound = departementHashSet.rechercherDepartement(department2);
        System.out.println("Search Result (by same finance object):  " + (isFound ? "Found" : "Not Found"));
        System.out.println();

        departementHashSet.supprimerDepartement(department1);
        System.out.println("After removing department 1:");
        departementHashSet.displayDepartement();
        System.out.println("--------------DEBUGGING-------------------");
        TreeSet<Departement> sortedDepartments = departementHashSet.trierDepartementById(new DepartementComparator());

        System.out.println("Sorted departments by ID:");
        for (Departement department : sortedDepartments) {
            System.out.println(department.toString());
        }

    }
}
