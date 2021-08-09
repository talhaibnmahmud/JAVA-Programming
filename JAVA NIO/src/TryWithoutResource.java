import java.io.FileInputStream;
import java.io.IOException;

public class TryWithoutResource {
    private static void printFile() {
        FileInputStream fileInputStream = null;

        try {
            fileInputStream = new FileInputStream("File.txt");
            int data;
            while((data = fileInputStream.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class TryWithResource {
    private static void print() {
        try (FileInputStream fileInputStream = new FileInputStream("File.txt")) {
            int data;
            while((data = fileInputStream.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}