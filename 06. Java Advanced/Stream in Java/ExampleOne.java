import java.util.List;
import java.util.List; 
import java.util.Arrays;

import java.util.stream.*;

public class ExampleOne{
    public static void main(String[] args){
        List<Integer> l=Arrays.asList(5,10,20,30,8,7);
        l.stream() 
         .filter(x->x%2==0)
         .filter(x->x>10) 
         .forEach(System.out::println);

    }
}