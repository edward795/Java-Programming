import java.util.PriorityQueue; 
import java.util.Comparator;


public class PriorityQueueMaxHeapOverride {
    public static void main(String[] args){ 
        PriorityQueue<Integer> q=new PriorityQueue<Integer>(new CustomComparator());
        q.add(34);
        q.add(78);
        q.add(97);
        q.add(23);
        System.out.println("Queue:"+q);


    }
}

//Custom class that implements the Comparator interface to override priortyQueue minHeap to MaxHeap
class CustomComparator implements Comparator<Integer>{
    @Override 
    public int compare(Integer num1,Integer num2){
        int value=num1.compareTo(num2);
        if(value>0){
            return -1;
        }else if(value<0){
            return 1;
        }else{
            return 0;
        }
    }
}