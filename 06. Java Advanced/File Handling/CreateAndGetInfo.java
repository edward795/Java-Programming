import java.io.*;

public class CreateAndGetInfo {
    public static void main(String[] args){
        File obj=new File("C:\\Users\\HOME PC\\Desktop\\Java Programming\\06. Java Advanced\\File Handling\\Sample.txt");
        if(obj.exists()){
            System.out.println(obj.getName());
            System.out.println(obj.getAbsolutePath());
            System.out.println(obj.canWrite());
            System.out.println(obj.canRead());
            System.out.println(obj.length());
        }
        else{
            System.out.println("File does not exists!");
        }
    }
}
