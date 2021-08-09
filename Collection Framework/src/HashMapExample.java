import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashMapExample {
    public static void main(String[] args) {
        Map<HashMapPerson, String> phoneBook = new HashMap<>();

        HashMapPerson jason = new HashMapPerson("Jason");
        HashMapPerson allie = new HashMapPerson("Allie");
        HashMapPerson jack = new HashMapPerson("Jack");
        HashMapPerson jennifer = new HashMapPerson("Jennifer");

        phoneBook.put(jason, "123456");
        phoneBook.put(allie, "120259");
        phoneBook.put(jack, "120156");
        phoneBook.put(jennifer, "323496");

        int size = phoneBook.size();
        System.out.println("Size of PhoneBook: " + size);

        for(Map.Entry<HashMapPerson, String> entry : phoneBook.entrySet()) {
            System.out.println(entry.getKey().toString() + " - " + entry.getValue());
        }
    }
}

class HashMapPerson {
    private String name;

    HashMapPerson(String name) {this.name = name;}

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    @Override
    public String toString() {return name;}

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;

        HashMapPerson hashMapPerson = (HashMapPerson) o;
        return Objects.equals(name, hashMapPerson.name);
    }

    @Override
    public int hashCode() {return Objects.hash(name);}
}