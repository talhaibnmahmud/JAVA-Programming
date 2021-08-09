public class PrintExceptionInfo {
    public static void main(String[] args) {
        int a = 5;

        try {
            int result = a / 0;
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
            System.out.println(e.toString());
        }

        calculate(a, -5);
    }

    private static void calculate(int a, int b) {
        if(a < 0) {
            throw new IllegalArgumentException("Argument 'a' can't be negative");
        }
        if(b < 0) {
            throw new IllegalArgumentException("Argument 'b' can't be negative");
        }
    }
}
