class Calculator {
    int add(int a, int b) {return a + b;}

    int add(int[] values) {
        int result = 0;

        for(int value : values) {
            result += value;
        }

        return result;
    }
}