import java.util.*;
import java.io.*;

public class TryWithMultipleResources {
    public static void main(String[] args) throws IOException{
       try(Scanner sc =new Scanner(new File("sample.txt"));
           PrintWriter writer = new PrintWriter(new File("readOutput.txt"))){
               while(sc.hasNext()){
                   writer.print(sc.nextLine());
               }
           }
    }
}
