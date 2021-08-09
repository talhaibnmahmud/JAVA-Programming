import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        Map<TreeMapPerson, String> phoneBook = new TreeMap<>();

        TreeMapPerson talha = new TreeMapPerson("Talha");
        TreeMapPerson ananna = new TreeMapPerson("Ananna");

        phoneBook.put(talha, "1707057");
        phoneBook.put(ananna, "0262662");

        for(Map.Entry<TreeMapPerson, String> entry : phoneBook.entrySet()) {
            System.out.println(entry.getKey().toString() + " - " + entry.getValue());
        }
    }
}

class TreeMapPerson implements Comparable<TreeMapPerson>{
    private String name;

    TreeMapPerson(String name) {this.name = name;}

    public String getName() {return name;}

    @Override
    public String toString() {return name;}

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;

        TreeMapPerson treeMapPerson = (TreeMapPerson) o;
        return Objects.equals(name, treeMapPerson.name);
    }

    @Override
    public int hashCode() {return Objects.hash(name);}

    @Override
    public int compareTo(TreeMapPerson o) {
        return this.name.compareTo(o.name);
    }
}
