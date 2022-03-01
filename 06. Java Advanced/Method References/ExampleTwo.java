import java.util.Arrays; 
import java.util.List;

public class ExampleTwo {
    public static void main(String[] args){
       List<Integer> l=Arrays.asList(10,15,32,45,67);
       //l.forEach(x->printSquare(x));

       l.forEach(ExampleTwo::printSquare);
    }

    public static void printSquare(Integer x){
        System.out.println(x*x);
    }
}
