import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

public class FileCopier {
    public static void main(String[] args) {
        File sourceFile = new File("Source.txt");
        File sinkFile = new File("Sink.txt");
        copy(sourceFile, sinkFile);
    }

    private static void copy(File sourceFile, File sinkFile) {
        if(!sourceFile.exists() || !sinkFile.exists()) {
            System.out.println("Source or Destination file not found");
            return;
        }

        try (FileChannel sourceChannel =
                new FileInputStream(sourceFile).getChannel();
             FileChannel sinkChannel =
                new FileOutputStream(sinkFile).getChannel()
             ) {
            sourceChannel.transferTo(0, sourceChannel.size(), sinkChannel);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
