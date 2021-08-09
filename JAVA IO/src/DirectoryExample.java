import java.io.File;
import java.io.IOException;

public class DirectoryExample {
    public static void main(String[] args) throws IOException {
        File directory = new File("D:\\Java\\JAVA Programming\\JAVA IO\\File");

        directory.mkdir();

        String directoryPath = directory.getPath();
        System.out.println("Directory Path: " + directoryPath);

        String fileName = "Hello.txt";
        File file = new File(directoryPath + File.separator + fileName);
        file.createNewFile();

        String filePath = file.getPath();
        System.out.println("File Path: " + filePath);
    }
}
