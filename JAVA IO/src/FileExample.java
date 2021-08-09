import java.io.File;
import java.io.IOException;

public class FileExample {
    public static void main(String[] args) {
        String workingDirectory = System.getProperty("user.dir");
        String newFile = workingDirectory + File.separator + "Hello.txt";
        File file = new File(newFile);
        if(file.exists()) {
            System.out.println("File Exists");
        } else {
            System.out.println("File does not exist, let's create one");
        }

        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
