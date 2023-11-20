import java.util.TreeSet;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //System.out.println("stupid"); check check
        DepartementHashSet departementHashSet = new DepartementHashSet();

        Departement dept1 = new Departement(1, "reseau", 30);
        Departement dept2 = new Departement(2, "prog", 72);
        Departement dept3 =new Departement(3,"math",20);

        //add
        departementHashSet.ajouterDepartement(dept1);
        departementHashSet.ajouterDepartement(dept2);

        //display
        System.out.println("my departments:");
        departementHashSet.displayDepartement();


        //search b name
        String Name = "reseau";
        if (departementHashSet.rechercherDepartement(Name)) {
            System.out.println("Department with name " + Name + " found.");
        } else {
            System.out.println("Department with name " + Name + " not found.");
        }

        //search obj
        if (departementHashSet.rechercherDepartement(dept3)) {
            System.out.println("Department found.");
        } else {
            System.out.println("Department not found.");
        }
         //remove
        departementHashSet.supprimerDepartement(dept2);


        departementHashSet.displayDepartement();

        // Trie
        System.out.println("Departments sorted by id:");
        TreeSet<Departement> sortedDepartements = departementHashSet.trierDepartementById();
        for (Departement d : sortedDepartements) {
            System.out.println(d);
        }

    }
}