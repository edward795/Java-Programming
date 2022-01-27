import java.io.*;
public class IteratingArrays {
    public static void main(String[] args){
        int arr[] = {10,20,30,40,50,60,70};
        int sum=0;
        int sumsq=0;
        double mean=0,stddev=0;
        // for(int i=0;i<arr.length;i++){
        //    sum+=arr[i];
        //    sumsq+=arr[i]*arr[i];
        // }
        
        for(int item:arr){
            sum+=item;
            sumsq+=item*item;
        }

        mean=sum/arr.length;
        stddev=Math.sqrt(sumsq/arr.length - mean*mean);
        System.out.printf("Mean of array:%.2f\n",mean);
        System.out.printf("Standard Deviation of array:%.2f\n",stddev);


        
    }
}
