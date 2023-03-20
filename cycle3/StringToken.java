import java.util.Scanner;
import java.util.StringTokenizer;


public class StringToken {
    public static void main(String[] args) {
        int sum=0,n;
        System.out.println("Enter the integers sepearated by space");
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();

        StringTokenizer st = new StringTokenizer(str," ");
        System.out.println("\nIntegers in the list");
        while(st.hasMoreTokens()){
            n = Integer.parseInt(st.nextToken());
            System.out.print(n+ " ");
            sum += n;
        }
        System.out.println("Sum = "+sum);
    }
}
