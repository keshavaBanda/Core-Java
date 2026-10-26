
interface A{
    int age = 10;
    String area = "Bangalore";

    void config();
    void show();
}

class B implements  A{
    public void config(){
        System.out.println("Configuration");
    }
    public void show(){
        System.out.println("It is Show");
    }
}

public class TestInterface {
    public static void main(String[] args) {
        A a = new B();
        a.show();
        a.config();
        System.out.println(A.age + " : "+ A.area);
    }
}
