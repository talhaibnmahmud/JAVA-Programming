public class MethodCallStackDemo {
    public static void main(String[] args) {
        System.out.println("Inside main method");
        methodA();
        System.out.println("Exiting main method");
    }

    private static void methodA() {
        System.out.println("Inside method A");
        methodB();
        System.out.println("Exiting method A");
    }

    private static void methodB() {
        System.out.println("Inside method B");
        methodC();
        System.out.println("Exiting method B");
    }

    private static void methodC() {
        System.out.println("Inside method C");
        methodD();
        System.out.println("Exiting method C");
    }

    private static void methodD() {
        System.out.println("Inside method D");
        System.out.println(5 / 0);
        System.out.println("Exiting method D");
    }
}
