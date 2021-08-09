public class StringBuilderDemo {
    public static void main(String[] args) {
        int a = 300;
        double b = 3.14;
        short c = 5;
        char d = 'A';

        StringBuilder builder = new StringBuilder();
        builder.append(a)
                .append("\n")
                .append(b)
                .append("\n")
                .append(c)
                .append("\n")
                .append(d);

        String result = builder.toString();
        System.out.println(result);
    }
}
