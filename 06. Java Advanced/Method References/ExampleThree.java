import java.util.Arrays;


public class ExampleThree{
public static void main(String[] args){
   String a[]={"apple","orange","grapes"};
   String b[]={"APPLE","ORANGE","GRAPES"};

//    if(Arrays.equals(a,b,(x1,x2)->String.compareToIgnoreCase(x1,x2))) 
//        System.out.println("YEs");
//    else 
//        System.out.println("No");
   
   if(Arrays.equals(a,b,String::compareToIgnoreCase))
       System.out.println("Yes");
   else 
       System.out.println("No");
  }
}
    