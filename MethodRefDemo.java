
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class Student {
    String name;
    int age;

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Student[");
        sb.append("name=").append(name);
        sb.append(", age=").append(age);
        sb.append(']');
        return sb.toString();
    }
}

public class MethodRefDemo {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Keshava", "Banda", "Pooja");
        List<Student> students = new ArrayList<>();

        students = names.stream()
            // .map(name-> new Student(name))
            .map(Student::new)
            .toList();

        System.out.println(students);
    }
}
