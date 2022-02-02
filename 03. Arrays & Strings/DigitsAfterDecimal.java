import java.util.Scanner;
public class DigitsAfterDecimal {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in); 
        String s=sc.next();
        
        System.out.println(toDecimal(s));
        
    }
    public static String toDecimal(String no){
        int pos=no.indexOf('.');
        if(pos<0)
            return "";
        else 
            return no.substring(pos+1);
    }
}
