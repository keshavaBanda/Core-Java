
enum Laptop {
    Macbook(100000),
    Hp(70000),
    Ideapad(38000),
    Thinkpad(68000),
    ILaptop;

    private int price;

    Laptop() {
        price = 200;
    }

    Laptop(int price) {
        this.price = price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}

public class Enumerator {

    public static void main(String[] args) {
        Laptop lap = Laptop.ILaptop;
        System.out.println(lap);

        switch (lap) {
            case Macbook:
                System.out.println("Macbook Laptop");
                break;
            case Hp:
                System.out.println("Hp laptop");
                break;
            case Ideapad:
                System.out.println("Ideapad laptop");
                break;
            case Thinkpad:
                System.out.println("Thinkpad laptop");
                break;
            default:
                System.out.println("It is a New laptop");
                break;
        }
    }
}
