import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 100; i >= 0; i--) {
            queue.add(i);
        }

        while (!queue.isEmpty()) {
            Integer integer = queue.poll();
            doSomeWork(integer);
        }
    }

    private static void doSomeWork(Integer integer) {
        System.out.println("Doing some work with " + integer);
    }
}
