interface Computer {
    void code();
}

class Laptop implements Computer {
    public void code() {
        System.out.println("Code, compile and run");
    }
}

class Desktop implements Computer {
    public void code() {
        System.out.println("Code, compile and run :: Faster");
    }
}

class Developer {
    public void devApps(Computer comp) {
        comp.code();
    }
}

public class NeedofInterface {
    public static void main(String[] args) {
        Computer lap = new Laptop();
        Computer desk = new Desktop();
        Developer dev1 = new Developer();
        dev1.devApps(lap);
    }
}
