import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class FileChannelWrite {
    public static void main(String[] args) {
        File file = new File("Channel Output.txt");
//        String text = "I love Bangladesh";
        String text = "আমি বাংলায় গান গাই, আমি বাংলার গান গাই\n" +
                "আমি আমার আমিকে চিরদিন এই বাংলায় খুঁজে পাই।";
        Charset charset = StandardCharsets.UTF_8;

        /*try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            FileChannel fileChannel = fileOutputStream.getChannel();

            byte[] bytes = text.getBytes();
            ByteBuffer byteBuffer = ByteBuffer.wrap(bytes);

            fileChannel.write(byteBuffer);
            fileChannel.close();
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        try (FileChannel fileChannel = new FileOutputStream(file).getChannel()) {
            CharBuffer charBuffer = CharBuffer.wrap(text);
            ByteBuffer byteBuffer = charset.encode(charBuffer);
            fileChannel.write(byteBuffer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
