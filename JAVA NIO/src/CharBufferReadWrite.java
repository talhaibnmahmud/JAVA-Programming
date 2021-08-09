import java.nio.CharBuffer;

public class CharBufferReadWrite {
    public static void main(String[] args) {
        CharBuffer charBuffer = CharBuffer.allocate(8);
        System.out.println("Right after creation: ");
        printBuffer(charBuffer);

        for (int i = 65; i < 73; i++) {
            charBuffer.put((char) i);
        }

        System.out.println("After populating data: ");
        printBuffer(charBuffer);
    }

    private static void printBuffer(CharBuffer charBuffer) {
        System.out.println("Position: " + charBuffer.position() + ", " + "Limit: " + charBuffer.limit());
        System.out.print("Data: ");
        for(int i = 0; i < charBuffer.limit(); i++) {
            System.out.print(charBuffer.get(i) + " ");
        }
        System.out.println();
    }
}
