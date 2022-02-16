import java.util.Scanner;

public class throwsExample {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();

        divider(a,b);
    }

    public static void divider(int a,int b) throws ArithmeticException{
       int c=a/b;
       System.out.println("Answer:"+a/b);
    }
} 
