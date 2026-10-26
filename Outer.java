
abstract class A{

    public A(){
        System.out.println("A Constructor calls");
    }

}


class Outer {
    public static void main(String[] args) {
       A a = new A();
    }
}