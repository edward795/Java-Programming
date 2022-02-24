import java.io.*;

public class WritingToFile {
    public static void main(String[] args){
        try{
            FileWriter wr=new FileWriter("C:\\Users\\HOME PC\\Desktop\\Java Programming\\06. Java Advanced\\File Handling\\Sample.txt");
            wr.write("Hi,Welcome to Java Programming Language.");
            wr.close();
            System.out.println("Successfully Wrote!");
        }
        catch(IOException e){
            System.out.println("An error occurred!");
        }
    }
}
