public class ShallowCloningExample {
    public static void main(String[] args) throws CloneNotSupportedException {
        Course course = new Course();
        course.setCode("CSE 101");
        course.setName("Structured Programming");

        Student student1 = new Student();
        student1.setName("Sheldon Cooper");
        student1.setCourse(course);

        Student student2 = (Student) student1.clone();

        System.out.println(student2.getName());
        System.out.println(student2.getCourse().getName());

        System.out.println(student1.getCourse() == student2.getCourse());
    }
}
