
import java.util.Scanner;

class SumToN{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        int sum=0;
        /*for(int i=0;i<=n;i++){
           sum+=i;
        }*/
        sum=n*(n+1)/2;
        System.out.println("Sum is:"+sum);
    }
}