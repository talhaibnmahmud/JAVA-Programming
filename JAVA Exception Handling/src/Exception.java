import java.io.*;
import java.util.List;

public class Exception {
    List<Integer> list;
    static final int SIZE = 10;

    Exception(String message) {
    }

    public void writeList() {
        PrintWriter printWriter = null;

        try {
            System.out.println("Entered try statement");
            printWriter = new PrintWriter(new FileWriter("File.txt"));

            for(int i = 0; i < SIZE; i++) {
                Integer integer = list.get(i);
                printWriter.write(integer);
            }
        } catch (IOException e) {
            System.out.println("Here in catch Block");
        }
    }
}

class Finally {
    public void openFile() {
        FileReader fileReader = null;

        try {
            fileReader = new FileReader("SomeFile");

            int i = 0;
            while (i != -1) {
                i = fileReader.read();
                System.out.println((char) i);
            }
        } catch (IOException e) {
            System.out.println("IO Exception found");
        } finally {
            if(fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    System.out.println("FileReader is NULL");
                }
            }

            System.out.println("---File End---");
        }
    }
}