import java.util.Arrays;
import java.util.Random;

public class CharArraySort {
    public static void main(String[] args) {
        char[] array = new char[10];
        Random random = new Random();

        for(int i = 0; i < array.length; i++) {
            array[i] = (char) (random.nextInt(26) + 'A');
        }

        System.out.println("Array before sort: " + Arrays.toString(array));

        Arrays.sort(array);

        System.out.println("Array after sort: " + Arrays.toString(array));
    }
}
