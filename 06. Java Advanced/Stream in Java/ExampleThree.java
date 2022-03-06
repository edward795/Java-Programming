import java.util.Arrays;

public class ExampleThree {
    public static void main(String[] args){
       int arr[]={3,78,92,34,56};

        int max=Arrays.stream(arr)
                      .max() 
                      .getAsInt();
        System.out.println(max);
    }
}
