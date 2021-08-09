public class Course implements Cloneable{
    private String code;
    private String name;

    public String getCode() {
        return code;
    }

    void setCode(String code) {
        this.code = code;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class Student implements Cloneable {
    private String name;
    private Course course;

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    Course getCourse() {
        return course;
    }

    void setCourse(Course course) {
        this.course = course;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Student clone = (Student) super.clone();
        clone.setCourse((Course) this.course.clone());

        return clone;
    }
}