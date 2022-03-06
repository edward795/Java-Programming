import java.util.Arrays;

public class ExampleFour {
    public static void main(String[] args){
        int arr[] = {34,56,20,8,12};

        double av=Arrays.stream(arr)  
                        .average() 
                        .getAsDouble();
        System.out.println(av);
    }
}
