import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

//import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    /*@Test
    void test() {
        fail("Not yet implemented");
    }

    @org.junit.jupiter.api.Test
    void add() {
    }

    @org.junit.jupiter.api.Test
    void testAdd() {
    }*/

    @Test
    void testAddInt() {
        Calculator calculator = new Calculator();
        int a = 6, b = 7;

        int actual = calculator.add(a, b);

        Assertions.assertEquals(13, actual);
    }

    @Test
    void testAddIntArray() {
        int[] intArray = {1, 2, 3, 4, 5};

        Calculator calculator = new Calculator();
        int actual = calculator.add(intArray);

        Assertions.assertEquals(15, actual);
    }
}