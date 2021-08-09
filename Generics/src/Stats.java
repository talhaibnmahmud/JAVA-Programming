public class Stats<T extends Number> {
    private T[] nums;

    private Stats(T[] nums) {
        this.nums = nums;
    }

    private double average() {
        double sum = 0.0;
        for(T num : nums) {
            sum += num.doubleValue();
        }

        return sum / nums.length;
    }

    private void print() {
        for (T num : nums) {
            System.out.println(num + " ");
        }
    }

    public static void main(String[] args) {
        Integer[] integer = new Integer[10];
        for(int i = 0; i < 10; i++) {
            integer[i] = (i + 1) * 10;
        }

        Stats<Integer> integerStats = new Stats<> (integer);

        integerStats.print();
        System.out.println(integerStats.average());
    }
}
