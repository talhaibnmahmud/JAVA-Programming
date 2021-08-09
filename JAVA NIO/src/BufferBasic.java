import java.nio.ByteBuffer;
import java.nio.CharBuffer;

public class BufferBasic {
    public static void main(String[] args) {
        CharBuffer charBuffer = CharBuffer.allocate(10);
        int capacity = charBuffer.capacity();

//        byte[] bytes = new byte[10];
//        ByteBuffer byteBuffer = ByteBuffer.wrap(bytes);
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(512);

        System.out.println("Capacity: " + capacity);
        System.out.println(byteBuffer.capacity());
    }
}
