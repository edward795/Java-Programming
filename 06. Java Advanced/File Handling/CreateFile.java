import java.io.IOException;
import java.io.File;

public class CreateFile {
    public static void main(String[] args){
        File obj=new File("C:\\Users\\HOME PC\\Desktop\\Java Programming\\06. Java Advanced\\File Handling\\Sample.txt");
        try{
            if(obj.createNewFile()){
                System.out.println("New File Created!");
            }else{
                System.out.println("File already Exists!");
            }
        }
        catch(IOException e){
            System.out.println("Error Occurred! "+e.getMessage());
        }
    }
}
