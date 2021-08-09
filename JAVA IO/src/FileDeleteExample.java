import java.io.File;

public class FileDeleteExample {
    public static void main(String[] args) {
        File file1 = new File("Welcome.txt");
        file1.delete();

        File temp = new File("Temp.txt");
        temp.deleteOnExit();
    }
}
