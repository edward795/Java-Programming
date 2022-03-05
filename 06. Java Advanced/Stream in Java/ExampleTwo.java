import java.util.Arrays;

public class ExampleTwo {
    public static void main(String[] args){
        int arr[]={20,30,40,50};
        int sum=Arrays.stream(arr) 
                       .sum();
        System.out.println(sum);

    }
}
