class KeshavaWrong extends RuntimeException{
    public KeshavaWrong(String s){
        super(s);
    }
}

public class Ducking {
    public static void main(String[] args) {
        Main main = new Main();
        main.main();
    }
}

class Main {
    void main() {
        A a = new A();
        B b = new B();
        try {
            a.show();
            b.show();
        } catch (Exception ex) {
            System.out.println("Something went wrong..." + ex);
        }
    }

}

class A {
    void show() throws KeshavaWrong {
        int i = 0;
        int j = 0;
        // j = 18 / i;
        // System.out.println("A-Show " + j);
        throw new KeshavaWrong("Keshava is wrong");
    }
}

class B {
    void show() throws Exception {
        int i = 0;
        int j = 0;
        j = 18 / i;
        System.out.println("A-Show " + j);
        System.out.println("B-Show");
    }
}