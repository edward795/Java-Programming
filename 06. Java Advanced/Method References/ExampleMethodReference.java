import java.util.List;
import java.util.Arrays;

public class ExampleMethodReference {
    public static void main(String[] args){
         List<Integer> arr=Arrays.asList(10,20,15,47,68);
         //arr.forEach(x->System.out.println(x));

         arr.forEach(System.out::println);

    }

}
