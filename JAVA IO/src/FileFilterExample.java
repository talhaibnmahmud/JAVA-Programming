import java.io.File;
import java.io.FileFilter;

public class FileFilterExample {
    public static void main(String[] args) {
        File source = new File("D:\\Java\\JAVA Programming\\JAVA IO\\src");

        FileFilter javaFilter = new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                String fileName = pathname.getName();
                if(fileName.endsWith(".java")) {
                    return true;
                }
                return false;
            }
        };

        File[] listRoots = source.listFiles(javaFilter);
        assert listRoots != null;
        for(File file : listRoots) {
            System.out.println(file.getPath());
        }
    }
}
