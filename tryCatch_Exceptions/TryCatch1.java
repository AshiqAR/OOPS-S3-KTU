// Write a Java program that shows the usage of try, catch, throws and finally.

public class TryCatch1 {
    static void run() throws ArithmeticException{
        throw new ArithmeticException("This is arithmetic exception");
    }
    public static void main(String[] args) {
        System.out.println("Sample program to test try catch throws and finally");
        try{
            run();
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Inside the finally block");
        }
    }
}
