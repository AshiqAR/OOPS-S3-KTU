import java.util.Scanner;

public class Palindrome {

    public static void main(String args[]){
        String str;
        System.out.print("Enter the string: ");
        Scanner s = new Scanner(System.in);
        str = s.nextLine();
        int n = str.length();
        for(int i=0;i<n/2;i++){
            if(str.charAt(i) != str.charAt(n-i-1)){
                System.out.println("not Palindrome");
                return;
            }
        }
        System.out.println("Palindrome");
    }
}
