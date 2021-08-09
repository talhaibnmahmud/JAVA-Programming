import java.nio.charset.Charset;
import java.util.Map;
import java.util.Set;

public class AvailableCharsets {
    public static void main(String[] args) {
        Map<String, Charset> map = Charset.availableCharsets();

        Set<String> set = map.keySet();
        int count = set.size();

        System.out.println("Available Character Set Count: " + count);

        for(String charsetName : set) {
            System.out.println(charsetName);
        }
    }
}
