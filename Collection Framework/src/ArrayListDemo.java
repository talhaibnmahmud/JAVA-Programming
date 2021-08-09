import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<String> emperors = new ArrayList<>();

        emperors.add("Babur");
        emperors.add("Humayun");
        emperors.add("Akbar");
        emperors.add("Jahangir");
        emperors.add("Shah Jahan");
        emperors.add("Aurangzeb");

        System.out.println("Name of Emperors: " + emperors);
        System.out.println("Total Emperors: " + emperors.size());

        System.out.println("Second Emperor: " + emperors.get(1));

        emperors.set(2, "Akbar the Great");
        System.out.println("Name of Emperors: " + emperors);

        emperors.remove(3);
        emperors.remove("Aurangzeb");
        System.out.println("After removing 2 elements: " + emperors);

        emperors.add("Shah Jahan");
        System.out.println("After adding a new element: " + emperors);

        System.out.println("Index of Humayun: " + emperors.indexOf("Humayun"));
        System.out.println("Last index of Shah Jahan: " + emperors.lastIndexOf("Shah Jahan"));
    }
}
