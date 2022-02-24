import java.io.*;
import java.util.Scanner;

public class ReadingFromFile {
    public static void main(String[] args){
        try{
            FileReader fobj=new FileReader("C:\\Users\\HOME PC\\Desktop\\Java Programming\\06. Java Advanced\\File Handling\\Sample.txt");
            Scanner sc=new Scanner(fobj); 
            while(sc.hasNextLine()){
                String data=sc.nextLine();
                System.out.println(data);
            }
            fobj.close();
        }
        catch(Exception e){
            System.out.println("Error occurred:"+e.getMessage());
        }
    }
}
