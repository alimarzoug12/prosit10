import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
public class DepartementHashSet<T> implements IDepartement<T> {
    private Set<T> departements;
    private DepartementHashSet(){
        this.departements = new HashSet<>();
    }
    @Override
    public void ajouterDepartement(T t){
        departements.add(t);
    }
    @Override
    public boolean rechercherDepartement(String nom){
        for (T departement : departements){
            if(departement.toString().equals(nom)){
                return true;
            }
        }
        return false;
    }
    @Override
    public boolean rechercherDepartement(T t){
        return departements.contains(t);
    }
    @Override
    public void supprimerDepartement(T t){
        departements.remove(t);
    }
    @Override
    public void displayDepartement(){
        System.out.println("Les départements : ");
        for (T departement : departements){
            System.out.println(departement);
        }
    }
    @Override
    public TreeSet<T> trierDepartementById(){
        return new TreeSet<>(departements);
    }
}
