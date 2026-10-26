
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student> {
    String sname;
    int age;

    public Student(String sname, int age) {
        this.sname = sname;
        this.age = age;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Student{");
        sb.append("sname=").append(sname);
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }

    public int compareTo(Student that) {
        if(this.age> that.age){
            return 1;
        }else{
            return -1;
        }
    }
}

public class Demo2 {
    public static void main(String[] args) {
        List<Student> stds = new ArrayList<>();
        
        stds.add(new Student("Keshava", 25));
        stds.add(new Student("Tagore", 19));
        stds.add(new Student("Jithendra", 23));
        stds.add(new Student("Chandravathi", 45));

        Collections.sort(stds);

        for (Student s : stds) {
            System.out.println(s);
        }
    }
}
