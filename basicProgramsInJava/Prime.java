import java.util.Scanner;

public class Prime{
    Prime(){}
    public boolean checkPrime(int n){
        for(int i=2;i<=n/2;i++){
            if(n%i == 0)
                return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = s.nextInt();
        Prime p = new Prime();
        if(p.checkPrime(n)){
            System.out.println(n+" is a prime number");
        }
        else{
            System.out.println(n+ " is not a prime number");
        }
    }
}