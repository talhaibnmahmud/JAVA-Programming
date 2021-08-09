import java.nio.ByteBuffer;

public class BufferReadWrite {
    public static void main(String[] args) {
        ByteBuffer byteBuffer = ByteBuffer.allocate(8);
        System.out.println("Right after creation: ");
        printBuffer(byteBuffer);

        for (int i = 10; i < 18; i++) {
            byteBuffer.put((byte) i);
        }

        System.out.println("After populating data: ");
        printBuffer(byteBuffer);
    }

    private static void printBuffer(ByteBuffer byteBuffer) {
        System.out.println("Position: " + byteBuffer.position()+ ", Limit: " + byteBuffer.limit());
        System.out.print("Data: ");
        for(int i = 0; i < byteBuffer.limit(); i++) {
            System.out.print(byteBuffer.get(i) + " ");
        }
        System.out.println();
    }
}
