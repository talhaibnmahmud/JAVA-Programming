import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        Set<Integer> integers = new TreeSet<>();

        integers.add(4);
        integers.add(1);
        integers.add(5);
        integers.add(3);
        integers.add(2);

        System.out.println(integers);
    }
}
