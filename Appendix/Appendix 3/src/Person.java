public class Person implements Cloneable {
    private String firstName;
    private String lastName;

    private Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }
        if(obj == null) {
            return false;
        }
        if(getClass() != obj.getClass()) {
            return false;
        }

        Person person = (Person) obj;
        if(firstName != null) {
            if(!firstName.equals(person.firstName)) {
                return false;
            }
        } else {
            if(person.firstName != null) {
                return false;
            }
        }

        if(lastName != null) {
            return lastName.equals(person.lastName);
        } else {
            return person.lastName == null;
        }
    }

    private void changeName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    private String getFullName() {return firstName + " " + lastName;}

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        Person person1 = new Person("James", "Gosling");

        System.out.println("Person # 1: " + person1.getFullName());

        try {
            Person person2 = (Person) person1.clone();
            System.out.println("Person # 2: " + person2.getFullName());

            person1.changeName("James", "Bond");
            System.out.println("Person # 1: " + person1.getFullName());
            System.out.println("Person # 2 : " + person2.getFullName());

            person2.changeName("Masud", "Rana");
            System.out.println("Person # 2 : " + person2.getFullName());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
