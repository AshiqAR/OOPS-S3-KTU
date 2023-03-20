// create user defined exception

class MyException extends Exception{
    public MyException (String str){
        super (str);
    }
}

public class UserDefinedException {
    static void run() throws MyException{
        throw new MyException("This is user defined exception");
    }

    public static void main(String[] args) {
        try{
            run();
        }catch(MyException e){
            System.out.println(e.getMessage());
        }
    }
}
