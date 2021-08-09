import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterExample {
    public static void main(String[] args) {
        Writer writer;
        String data = "The quick brown fox jumps over the lazy dog";

        try {
            writer = new FileWriter("Output.txt");
            writer.write(data);
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
