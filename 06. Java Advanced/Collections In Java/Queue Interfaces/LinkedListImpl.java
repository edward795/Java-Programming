import java.util.LinkedList; 


public class LinkedListImpl {
    public static void main(String[] args){
        LinkedList<String> l=new LinkedList<String>();

        l.add("dog");
        l.add("cat");
        l.add("cow"); 

        System.out.println("Linked List:"+l);

        String s=l.get(2);
        System.out.println("Accessed Element:"+s); 

        l.set(2,"goat");
        System.out.println("New Linked List:"+l); 

        String st=l.remove(2);
        System.out.println("Removed Element:"+st);

    }
}
