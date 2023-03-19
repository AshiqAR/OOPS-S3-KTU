import java.util.Scanner;

public class freqOfCharInString {
    public static void main(String args[]) {
        String str;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the string: ");
        str = s.nextLine();
        System.out.print("Enter the string whose count is to be found: ");
        char c = s.nextLine().charAt(0);
        int count = 0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == c){
                count++;
            }
        }
        System.out.println("Frequency of "+c+" in string "+str +" = "+count);
    }
}
