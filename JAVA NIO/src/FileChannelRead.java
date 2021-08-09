import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class FileChannelRead {
    public static void main(String[] args) {
        File file = new File("Channel Input.txt");

        if(!file.exists()) {
            System.out.println("The input file does not exist");
            return;
        }

        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            FileChannel fileChannel = fileInputStream.getChannel();

            ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
            Charset charset = StandardCharsets.UTF_8;

            while (fileChannel.read(byteBuffer) > 0) {
                byteBuffer.flip();
                CharBuffer charBuffer = charset.decode(byteBuffer);

                while (charBuffer.hasRemaining()) {
                    char ch = charBuffer.get();
                    System.out.print(ch);
                }

                byteBuffer.clear();
            }

            fileChannel.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
