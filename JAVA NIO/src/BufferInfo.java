import java.nio.ByteBuffer;
import java.nio.InvalidMarkException;

public class BufferInfo {
    public static void main(String[] args) {
        ByteBuffer byteBuffer = ByteBuffer.allocate(8);
        System.out.println("Capacity: "+ byteBuffer.capacity());
        System.out.println("Limit: " + byteBuffer.limit());
        System.out.println("Position: " + byteBuffer.position());

        try {
            byteBuffer.reset();
            System.out.println("Mark: " + byteBuffer.position());
        } catch (InvalidMarkException e) {
            System.out.println("Mark is not set");
        }
    }
}
