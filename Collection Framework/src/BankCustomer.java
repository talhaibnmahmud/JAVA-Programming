import java.util.PriorityQueue;
import java.util.Queue;

public class BankCustomer implements Comparable<BankCustomer> {
    private String name;
    private Integer age;

    public BankCustomer(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }


    @Override
    public int compareTo(BankCustomer bankCustomer) {
        return bankCustomer.age.compareTo(this.age);
    }
}

class PriorityQueueExample {
    public static void main(String[] args) {
        Queue<BankCustomer> bankCustomers = new PriorityQueue<>();

        bankCustomers.offer(new BankCustomer("Person 1", 14));
        bankCustomers.offer(new BankCustomer("Person 2", 35));
        bankCustomers.offer(new BankCustomer("Person 3", 15));
        bankCustomers.offer(new BankCustomer("Person 4", 12));
        bankCustomers.offer(new BankCustomer("Person 5", 40));

        while (!bankCustomers.isEmpty()) {
            BankCustomer bankCustomer = bankCustomers.poll();
            serve(bankCustomer);
        }
    }

    private static void serve(BankCustomer bankCustomer) {
        System.out.println("Serving person - Name: " + bankCustomer.getName() + ", Age: " + bankCustomer.getAge());
    }
}
