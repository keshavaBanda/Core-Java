
interface PaymentProcessor{
    void process(double amt);
}

class CreditCard implements PaymentProcessor{
    public void process(double amt) {
        System.out.println("Credit Card");
    }
}

class NetBancking implements  PaymentProcessor{
    public void process(double amt){
        System.out.println("Net Banking");
    }
}

class CheckoutService{
    public void completeOrder(PaymentProcessor paymentMethod, double amt){
       paymentMethod.process(amt);
    }
}


public class Maintain {
    public static void main(String[] args) {
        PaymentProcessor card = new CreditCard();
        PaymentProcessor netbank = new NetBancking();

        CheckoutService cs = new CheckoutService();
        cs.completeOrder(card, 222.0);
    
    }
}
