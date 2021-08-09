import java.util.ArrayList;
import java.util.List;

public class WildcardArguments {
//    ArrayList<Object> arrayList = new ArrayList<String>();

//    List<String> stringList = new ArrayList<>();
//    List<Object> objectList = stringList;

    private static void printList(List<?> objects) {
        for(Object o : objects) {
            System.out.println(o);
        }
    }

    public static void main(String[] args) {
        List<Object> objectList = new ArrayList<>();
        objectList.add(55);
        printList(objectList);

        List<String> stringList = new ArrayList<>();
        stringList.add("One");
        printList(stringList);
    }
}
