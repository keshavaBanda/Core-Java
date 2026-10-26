class KeshavaException extends Exception{
    public KeshavaException(String str){
        super(str);
    }
}


public class ExceptionDemo {
    public static void main(String[] args) {
        int i = 40;
        int j = 0;

        try {
            j = 18 / i;
            if(j==0){
                throw new KeshavaException("I don't want to print zero");
            }
          
        }
        catch(ArithmeticException e) {
            j= 18/1;
            System.out.println("This is the default output - " + e);
        }
        catch(Exception e){
            System.out.println("Something went wrong " + e);
        }

        System.out.println("J value is " + j);
        System.out.println("Bye");
    }
}
