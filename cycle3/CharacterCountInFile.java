// Java program that displays the number of characters, lines and words in a text file

import java.io.*;

public class CharacterCountInFile {
    public static void main(String[] args) {
        int c = 0,w = 0,l = 0,i;
        char ch;
        try{
            FileReader f = new FileReader("file.txt");
            while((i=f.read()) != -1){
                if(l == 0){
                    l++;
                    w++;
                }
                ch = (char) i;
                if(ch == '\n'){
                    l++;
                    w++;
                }
                else if(ch==' '){
                    w++;
                }
                else{
                    c++;
                }
            }
        }
        catch(IOException e){
            System.out.println("IOException\n"+e);
        }
        System.out.println("Character count : "+c);
        System.out.println("Word count : "+w);
        System.out.println("Line Count : "+l);
    }
}
