import java.util.HashSet;
import java.util.Set;


public class Machine {

    private String name;
    private Set<SparePart> spareParts;

    public Machine(String name) {
        this.name = name;
        spareParts = new HashSet<>();
    }

    public Machine(String name, Set<SparePart> spareParts) {
        this.name = name;
        this.spareParts = spareParts;
    }

    public SparePart findById(Long id){
        for(SparePart s: spareParts){
            if(s.getId() == id) {
                return s;
            }
        }
        return null;
    }

    public void addANewSparePart(Long id, String name, double price){
        addANewSparePart(new SparePart(id,name,price));
    }

    public void addANewSparePart(SparePart sparePart){
        spareParts.add(sparePart);
    }

    public String getName() {
        return name;
    }

    public Set<SparePart> getSpareParts() {
        return spareParts;
    }
}
