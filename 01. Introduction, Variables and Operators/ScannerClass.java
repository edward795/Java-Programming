import java.util.Scanner;

class ScannerClass{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an Integer:");
        int i=sc.nextInt();
        System.out.println("Enter a String:");
        String s=sc.next();
        System.out.println("Enter a Float:");
        float f=sc.nextFloat();
        System.out.println("You entered the following:Integer:"+i+" String:"+s+" Float:"+f);

    }
}