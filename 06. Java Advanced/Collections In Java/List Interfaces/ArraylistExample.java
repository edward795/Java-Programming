import java.io.*;
import java.util.*;

public class ArraylistExample
{
	public static void main(String[] args) {
		List<Integer> data=new ArrayList<Integer>();
		
		data.add(1);
		data.add(2);
		data.add(3);
		data.add(4);
		data.add(5);
		System.out.println("List:"+data);

		int num=data.get(2);
		System.out.println("Data at index 2:"+num);

		int removed=data.remove(2);
		System.out.println("Removed Element:"+removed);
		
		System.out.println("newList:"+data);
         
		data.set(2,110);
		System.out.println("New arrayList:"+data);
        

	}
}
