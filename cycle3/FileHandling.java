// Program to write a string into a file

import java.io.*;

public class FileHandling{
    public static void main(String[] args) {
        String s = "Hello man\nHow are you";
        try{
            FileWriter f = new FileWriter("out.txt");
            f.write(s);
            System.out.println("Writing to file successful");
            f.close();
        }
        catch(IOException e){System.out.println("IOException\n"+e);}
    }
}