import java.io.File;

public class FileRenameExample {
    public static void main(String[] args) {
        File oldFile = new File("Hola.txt");
        File newFile = new File("Hello.txt");

        boolean fileRenamed = oldFile.renameTo(newFile);

        if(fileRenamed) {
            System.out.println(oldFile + " renamed to " + newFile);
        } else {
            System.out.println("Renaming " + oldFile + " to " + newFile + " failed");
        }
    }
}
