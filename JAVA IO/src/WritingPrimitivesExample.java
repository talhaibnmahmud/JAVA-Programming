import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WritingPrimitivesExample {
    public static void main(String[] args) {
        String destinationFileName = "Primitives.data";

        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(destinationFileName));

            dataOutputStream.writeInt(152);
            dataOutputStream.writeDouble(4.56);
            dataOutputStream.writeBoolean(true);
            dataOutputStream.writeLong(Long.MAX_VALUE);

            dataOutputStream.flush();
            dataOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
