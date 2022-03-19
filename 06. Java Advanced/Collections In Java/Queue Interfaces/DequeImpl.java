import java.util.Deque; 
import java.util.ArrayDeque;

public class DequeImpl {
    public static void main(String[] args){
        Deque<Integer> q=new ArrayDeque<Integer>();

        q.addFirst(10);
        q.addFirst(20);
        q.addFirst(30);
        q.offerFirst(100);

        q.addLast(40);
        q.addLast(50);
        q.addLast(60);
        q.offerLast(110);

        System.out.println("Deque:"+q);

        int pf=q.peekFirst();
        int pl=q.peekLast();

        int gf=q.getFirst();
        int gl=q.getLast();

        System.out.println("peekFirst:"+pf+" peekLast:"+pl);
        System.out.println("getFirst:"+gf+" getLast:"+gl);

        int pollf=q.pollFirst();
        int polll=q.pollLast();

        int removef=q.removeFirst();
        int removel=q.removeLast();

        System.out.println("pollFirst:"+pollf+" pollLast:"+polll);
        System.out.println("removeFirst:"+removef+" removeLast:"+removel);

    }
}
