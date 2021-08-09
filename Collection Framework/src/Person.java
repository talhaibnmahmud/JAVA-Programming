import java.util.Set;
import java.util.TreeSet;

public class Person implements Comparable<Person> {
    private String name;
    Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Person person) {
        return name.compareTo(person.name);
    }
}

class TreeExample {
    public static void main(String[] args) {
        Set<Person> persons = new TreeSet<>();

        persons.add(new Person("Talha"));
        persons.add(new Person("Ananna"));

        for(Person person : persons) {
            System.out.println(person);
        }
    }
}
