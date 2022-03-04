import java.util.Scanner; 
import java.math.*;
import java.math.BigInteger;

public class Factorial_Of_Big_numbers {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number;");
        int num=sc.nextInt();
        BigInteger fact=new BigInteger("1");
        for(int i=2;i<=num;i++){
            BigInteger x=BigInteger.valueOf(i);
            fact=fact.multiply(x);
        }

        System.out.println("Factorial:"+fact);
    }
}
