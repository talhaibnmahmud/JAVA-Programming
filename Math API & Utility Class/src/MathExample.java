public class MathExample {
    public static void main(String[] args) {
        int a = 10_20;
        int b = -19;
        double x = 152.3;
        double y = 0.349;

        System.out.println("|" + a + "| is " + Math.abs(a));
        System.out.println("|" + b + "| is " + Math.abs(b));
        System.out.println("|" + x + "| is " + Math.abs(x));
        System.out.println("|" + y + "| is " + Math.abs(y));

        int p = 2;
        System.out.println("The square root of " + p + " is " + Math.sqrt(p));

        System.out.println(x + " is approximately " + Math.round(x));
        System.out.println(y + " is approximately " + Math.round(y));

        System.out.println("The ceil of " + a + " is " + Math.ceil(a));
        System.out.println("The ceil of " + b + " is " + Math.ceil(b));
        System.out.println("The ceil of " + x + " is " + Math.ceil(x));
        System.out.println("The ceil of " + y + " is " + Math.ceil(y));

        System.out.println("The floor of " + a + " is " + Math.floor(a));
        System.out.println("The floor of " + b + " is " + Math.floor(b));
        System.out.println("The floor of " + x + " is " + Math.floor(x));
        System.out.println("The floor of " + y + " is " + Math.floor(y));

        System.out.println("Minimum of " + a + " & " + b + " is " + Math.min(a, b));
        System.out.println("Minimum of " + x + " & " + y + " is " + Math.min(x, y));

        System.out.println("Maximum of " + a + " & " + b + " is " + Math.max(a, b));
        System.out.println("Maximum of " + x + " & " + y + " is " + Math.max(x, y));

        System.out.println("Pi is " + Math.PI);
        System.out.println("E is " + Math.E);
    }
}
