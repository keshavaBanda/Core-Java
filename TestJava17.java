sealed class Computer permits Laptop, Desktop, Mobile {

}

non-sealed class Laptop extends Computer {

}

non-sealed class Desktop extends Computer {

}

sealed class Mobile extends Computer permits Andorid, IOS  {

}

final class Andorid extends Mobile {
    
}
final class IOS extends Mobile{

}

class Human {

}

public class TestJava17 {
    public static void main(String[] args) {

    }
}
