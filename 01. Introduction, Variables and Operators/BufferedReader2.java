import java.io.*;
class BufferedReader2{
    public static void main(String[] args) throws IOException{
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter an Integer:");
      int i=Integer.parseInt(br.readLine());
      System.out.println("The Entered Integer:"+i);
      }
}