import java.io.Serializable;

// class Student{
//     int sid;
//     String sname;
//     int age;

//     public Student(int sid, String sname, int age) {
//         this.sid = sid;
//         this.sname = sname;
//         this.age = age;
//     }

//     public int getSid() {
//         return sid;
//     }
//     public void setSid(int sid) {
//         this.sid = sid;
//     }
//     public String getSname() {
//         return sname;
//     }
//     public void setSname(String sname) {
//         this.sname = sname;
//     }
//     public int getAge() {
//         return age;
//     }
//     public void setAge(int age) {
//         this.age = age;
//     }

//     @Override
//     public String toString() {
//         return "Student [sid=" + sid + ", sname=" + sname + ", age=" + age + "]";
//     }

//     @Override
//     public int hashCode() {
//         final int prime = 31;
//         int result = 1;
//         result = prime * result + sid;
//         result = prime * result + ((sname == null) ? 0 : sname.hashCode());
//         result = prime * result + age;
//         return result;
//     }

//     @Override
//     public boolean equals(Object obj) {
//         if (this == obj)
//             return true;
//         if (obj == null)
//             return false;
//         if (getClass() != obj.getClass())
//             return false;
//         Student other = (Student) obj;
//         if (sid != other.sid)
//             return false;
//         if (sname == null) {
//             if (other.sname != null)
//                 return false;
//         } else if (!sname.equals(other.sname))
//             return false;
//         if (age != other.age)
//             return false;
//         return true;
//     }

// }

record Student(int sid, String sname) implements Serializable {
    static String school;

    public Student {
        if(sid ==0){
            throw new IllegalArgumentException("Id required..");
        }
    }

    public void show(){

    }

}

public class RecordClass {
    public static void main(String[] args) {
        Student.school = "SVV";
        Student std = new Student(1, "Keshava");
        Student std2 = new Student(1, "Keshava");
        System.out.println(std);

        System.out.println(std.equals(std2));
    }
}