import java.util.Arrays;
import java.util.Comparator;

public class ObjectArraySort {
    public static void main(String[] args) {
        NameSort[] nameSorts = new NameSort[] {
                new NameSort("Talha", "Mahmud"),
                new NameSort("Taimun", "Ananna"),
                new NameSort("Alvi", "Nabil"),
                new NameSort("Umama", "Mahmud")
        };

        Arrays.sort(nameSorts, new Comparator<NameSort>() {
            @Override
            public int compare(NameSort o1, NameSort o2) {
                return o1.getFirstName().compareTo(o2.getFirstName());
            }
        });
    }
}
