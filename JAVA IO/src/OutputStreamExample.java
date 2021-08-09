import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamExample {
    public static void main(String[] args) {
        String destinationFile = "Output.txt";
        String data = "The quick brown fox jumps over the lazy dog";

        try {
            FileOutputStream fileOutputStream = new FileOutputStream(destinationFile);
            fileOutputStream.write(data.getBytes());
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
