import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadingPrimitivesExample {
    public static void main(String[] args) {
        String sourceFile = "Primitives.data";

        try {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(sourceFile));

            System.out.println(dataInputStream.readInt());
            System.out.println(dataInputStream.readDouble());
            System.out.println(dataInputStream.readBoolean());
            System.out.println(dataInputStream.readLong());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
