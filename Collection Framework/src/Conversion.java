import java.util.*;

public class Conversion {
    //Method 1
    List<Integer> integers1 = Arrays.asList(0, 1, 2, 3, 4, 5);

    //Method 2
    private Integer[] integers = {1, 2, 3, 4, 5, 6, 7, 8};
    List<Integer> integers2 = Arrays.asList(integers);

    //List to Array
    private List<Integer> sourceList = new ArrayList<>();
    Integer[] targetArray = sourceList.toArray(new Integer[sourceList.size()]);

    //List to Set
    Set<Integer> targetSet = new HashSet<>(sourceList);

    //Set to List
    Set<Integer> sourceSet = new HashSet<>();
    List<Integer> targetList = new ArrayList<>(sourceList);
}
