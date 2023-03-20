import java.io.*;

public class ReadFromFileAndWriteIntoAnother {
    public static void main(String[] args) {
        File f1 = new File("file.txt");
        File f2 = new File("out.txt");
        int i;

        try{
            FileReader fr = new FileReader(f1);
            FileWriter fw = new FileWriter(f2);
            while((i = fr.read()) != -1){
                fw.write(i);
            }
            System.out.println("Reading and writing successful");
            fr.close();
            fw.close();
        }
        catch(IOException e){
            System.out.println("IOException");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
