import java.util.Scanner;

public class ThrowExample {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        
        if(b==0){
            throw new ArithmeticException("Divide By Zero!!");
        }else{
            System.out.println("Answer:"+a/b);
        }
    }
}
