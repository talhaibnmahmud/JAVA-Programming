import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Tuple<X, Y> {
    private X x;
    private Y y;

    private Tuple(X x, Y y) {
        this.x = x;
        this.y = y;
    }

    X getX() {
        return x;
    }

    Y getY() {
        return y;
    }

    private void showTypes() {
        System.out.println("Type of T is: "+ x.getClass().getName() + " and Value: "+ x);
        System.out.println("Type of V is: "+ y.getClass().getName() + " and Value: "+ y);
    }

    public static void main(String[] args) {
        Tuple<String, String> tuple = new Tuple<>("Hello", "World!");

        tuple.showTypes();

        Tuple<String, Integer> person = new Tuple<>("Talha", 21);
        person.showTypes();

        Tuple<String, Tuple<Integer, Integer>> tupleTuple = new Tuple<>("Tuple", new Tuple<>(45, 90));
        tupleTuple.showTypes();

        Map<String, List<String>> listMap = new HashMap<>();
    }
}
