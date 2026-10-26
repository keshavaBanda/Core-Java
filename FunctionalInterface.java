
@java.lang.FunctionalInterface
interface A {
    int show(int i, int j);
}

public class FunctionalInterface {
    public static void main(String[] args) {
        A a = (i, j) ->  i+j;
        System.out.println(a.show(5, 5));
    }
}
