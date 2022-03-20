import java.util.Queue; 
import java.util.PriorityQueue;
import java.util.Iterator;

public class PriorityQueueImpl {
    public static void main(String[] args){
       PriorityQueue<Integer> q=new PriorityQueue<Integer>();

       q.offer(34);
       q.offer(3);
       q.offer(45);

       q.add(10);
       q.add(5);

       System.out.println("Queue:"+q);

       int num=q.peek();
       System.out.println("Accessed Element:"+num);

       int rnum=q.poll();
       System.out.println("Removed Element:"+rnum);
       System.out.println("Queue:"+q);

       int re=q.remove();
       System.out.println("Removed Element:"+re);
       System.out.println("Queue:"+q);

       Iterator<Integer> iter =q.iterator();
       
       System.out.println("Iterating Over Queue:");
       while(iter.hasNext()){
           System.out.print(iter.next()+"\t");
       }
    }
}
