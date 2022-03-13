import java.util.Vector; 
import java.util.Iterator;

public class VectorsExample {
    public static void main(String[] args){
        Vector<String> v=new Vector<String>();
        v.add("Python");
        v.add("C++");
        v.add("Java");

        System.out.println("Vectors is:"+v);

        String item=v.get(2);
        System.out.println("Element is:"+item);

        String ritem=v.remove(2);
        System.out.println("Removed Element:"+ritem);

        Vector<String> v1=new Vector<String>();
        v1.add("Ruby");
        v1.add("Swift");

        v.addAll(v1);
        System.out.println("New Vector:"+v);

        //Iterating through elements 

        Iterator<String> iter=v.iterator();
        System.out.println("Iterating through Vector:");
        while(iter.hasNext()){
            System.out.print(iter.next());
            System.out.print(" ");
        }


        //Clear
        System.out.println();
        v.clear();
        System.out.println("Vector Cleared:"+v);


        

    }
}
