import java.util.Objects;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;

    Employee(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName);
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;

        Employee employee = (Employee) obj;

        return Objects.equals(id, employee.id) &&
                Objects.equals(firstName, employee.firstName) &&
                Objects.equals(lastName, employee.lastName);
    }

    @Override
    public String toString() {
        return id + ": " + firstName + " " + lastName;
    }
}

class EmployeeExample {
    public static void main(String[] args) {
        Employee employee = new Employee(7, "James", "Bond");

        System.out.println(employee.toString());
    }
}