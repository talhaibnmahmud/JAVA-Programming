import java.io.File;

public class ListingFile {
    public static void main(String[] args) {
        File source = new File("D:\\Java\\JAVA Programming\\JAVA IO\\src");

        File[] listRoots = source.listFiles();
        assert listRoots != null;
        for (File file : listRoots) {
            System.out.println(file.getPath());
        }
    }
}
