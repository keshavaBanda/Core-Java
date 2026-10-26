class A {
    int a = 10;
    static int b = 20;

    public void show() {
        System.out.println("A show");
    }

    class B {
        public void show2() {
            System.out.println("B show");
        }
    }

    static class C {
        public void show3() {
            System.out.println("C show");
        }
    }
}

public class Inner {
    public static void main(String[] args) {
        A a = new A();
        a.show();
        // Non-static Inner class
        A.B ab = a.new B();
        ab.show2();

        // static Inner Class
        A.C abc = new A.C();
        abc.show3();
    }
}
