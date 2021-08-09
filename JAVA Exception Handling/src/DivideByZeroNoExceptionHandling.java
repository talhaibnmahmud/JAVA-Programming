import java.util.Scanner;

public class DivideByZeroNoExceptionHandling {
    private static int divide(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter an integer: ");
        int a = scanner.nextInt();
        System.out.println("Please enter another integer: ");
        int b = scanner.nextInt();

        int result = divide(a, b);

        System.out.println("Result: "+ a +" / " + b + " = " + result);
    }
}
