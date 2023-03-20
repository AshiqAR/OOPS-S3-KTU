// Java program that reads a file and displays the file on the screen, with a line 
// number before each line
import java.io.*;

public class ReadFromFile {
    public static void main(String[] args) {
        int ln = 0,i;
        try{
            FileReader f = new FileReader("out.txt");
            while((i=f.read()) != -1){
                if(ln == 0){
                    ln = 1;
                    System.out.print(ln+" ");
                }
                System.out.print((char) i);
                if((char) i == '\n'){
                    ln++;
                    System.out.print(ln+" ");
                }
            }
        }
        catch(IOException e){
            System.out.println("IOException\n"+e);
        }
        System.out.println();
    }
}
