import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        Set<String> cities = new LinkedHashSet<>();

        cities.add("Dhaka");
        cities.add("Delhi");
        cities.add("Switzerland");
        cities.add("Switzerland");
        cities.add("London");
        cities.add("London");

        System.out.println("Total cities: " + cities.size());
        System.out.println(cities);
    }
}
