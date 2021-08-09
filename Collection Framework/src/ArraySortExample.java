import java.util.Arrays;
import java.util.Random;

public class ArraySortExample {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();

        for(int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100) + 1;
        }

        System.out.println("Array before sort: " + Arrays.toString(array));

        Arrays.sort(array);

        System.out.println("Array after sort: " + Arrays.toString(array));
    }
}
