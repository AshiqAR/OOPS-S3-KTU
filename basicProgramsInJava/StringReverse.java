import java.util.Scanner;

// reverse a string 
import java.util.Scanner;;

public class StringReverse {
    public static void main(String args[]) {
        String str;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the string: ");
        str = s.nextLine();
        int n = str.length();
        String reverse = "";
        for(int i=0;i<n;i++){
            reverse = reverse + str.charAt(n-i-1);
        }
        System.out.println("Reversed String: "+reverse);
    }
}
