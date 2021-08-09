public class CurrentWorkingDirectory {
    public static void main(String[] args) {
        String workingDirectory = System.getProperty("user.dir");
        System.out.println(workingDirectory);
    }
}
