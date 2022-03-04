import java.math.BigInteger;
import java.util.Scanner;

public class isPrimeandnextPrime {
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the no:");
      int n=sc.nextInt();
      System.out.println("Prime:"+isPrime(n));
      System.out.println("next PRime:"+nextPrime(n));
    }


public static boolean isPrime(int n){
    BigInteger b=BigInteger.valueOf(n);
    return b.isProbablePrime(1);
}

public static int nextPrime(int n){
    BigInteger b=BigInteger.valueOf(n);
    String a=b.nextProbablePrime().toString();
    return Integer.parseInt(a);
}
}