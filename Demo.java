interface Payment2{
    static void pay() {
        System.out.println("Static in Interface");
    }
}


enum Status {
    Running, Failed, Success, Hold // Named Constant
}

abstract class Payment {
    abstract public void pay();
}

class CreditCard extends  Payment{

    @Override
    public void pay() {
       System.out.println("PAY WITH CREDIT CARD");
    }
    
}

class UpiPayment extends Payment {

    @Override
    public void pay() {
        System.out.println("Payment using UPI");
    }
}

class A implements Payment2{

}

public class Demo {
    public static void main(String[] args) {
        Status s1 = Status.Running;
        
        Status[] ss = Status.values();
        for(Status s: ss){
            System.out.println(s + " : "+ s.ordinal());
        }

      Payment2.pay();

    }
}
