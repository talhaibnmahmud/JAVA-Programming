import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BinarySearchExample {
    public static void main(String[] args) {
        List<SearchPerson> people = new ArrayList<>();

        people.add(new SearchPerson("Talha"));
        people.add(new SearchPerson("Ananna"));
        people.add(new SearchPerson("Umama"));
        people.add(new SearchPerson("Nabil"));

        people.sort(Comparator.comparing(SearchPerson::getName));

        SearchPerson key = new SearchPerson("Talha");

        int index = Collections.binarySearch(people, key);
        if(index != -1) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }
    }
}

class SearchPerson implements Comparable<SearchPerson> {
    private String name;

    SearchPerson(String name) {this.name = name;}
    String getName() {return name;}
    public void setName(String name) {this.name = name;}

    @Override
    public int compareTo(SearchPerson o) {
        return this.name.compareTo(o.getName());
    }
}
