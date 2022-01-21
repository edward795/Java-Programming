import java.util.Scanner;
public class NestedIfElse{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        if(n<0){
            System.out.println("Negative!");
            if(n%2==0){
                System.out.println("Even!");
                return;
            }
            System.out.println("Odd!");
        }
        else if(n>0){
            System.out.println("Positive!");
            if(n%2==0){
                System.out.println("Even!");
                return;
            }
            System.out.println("Odd!");
        }
        else{
            System.out.println("Zero!");
        }
    }
}