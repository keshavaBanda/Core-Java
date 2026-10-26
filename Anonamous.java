// Anonomous Abstract Class 
abstract class A{
    public abstract void show1();
    public abstract void config();
}

public class Anonamous {
    public static void main(String[] args) {
        A a = new A(){
            public void show1(){
                System.out.println("A new show");
            }
            public void config(){
                System.out.println("Config in A class");
            }
        };


        a.show1();
        a.config();
    }
}
