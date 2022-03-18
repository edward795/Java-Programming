import java.util.LinkedHashSet;
import java.util.List;
import java.util.Arrays;
import java.util.Iterator;

public class LinkedHashSetExample {
    public static void main(String[] args){
         LinkedHashSet<Integer> numbers = new LinkedHashSet<>(8,0.75f); 
         LinkedHashSet<Integer> evenNumbers=new LinkedHashSet<>(8,0.75f);

         //addition of elements
         evenNumbers.add(2);
         evenNumbers.add(4);
         evenNumbers.add(6); 

         System.out.println("Numbers:"+evenNumbers); 

         //creating from other collections
         Integer arr[] = new Integer[] { 1,2,3,4,5,6,7,8,9,10};
         List<Integer> nums = Arrays.asList(arr); 

         LinkedHashSet<Integer> numberSet = new LinkedHashSet<>(nums);
         System.out.println(numberSet);
         
         //access linked HashSet elements
         Iterator<Integer> iter = evenNumbers.iterator();
         System.out.println("iterating through numbers:");
         while(iter.hasNext()){
             System.out.print(iter.next());
             System.out.print(" ");
         }
   
         //Remove Elements from HashSet 
         boolean re=numberSet.remove(20);
         System.out.println("Removed 20?:"+re);
         boolean rem=numberSet.removeAll(evenNumbers);
         System.out.println("Removed All elements:"+rem);
        

         System.out.println("Even nums:"+evenNumbers);
         System.out.println("nums:"+numbers);
         
        
            numbers.add(1);
            numbers.add(2);
            numbers.add(3); 
         //union 
         evenNumbers.addAll(numbers);
         System.out.println("Union:"+evenNumbers);

         //intersection
         evenNumbers.retainAll(numbers);
         System.out.println("Intersection:"+evenNumbers);

         //difference 
         evenNumbers.removeAll(numbers);
         System.out.println("differnce:"+evenNumbers);

         //subset 
         boolean sub=evenNumbers.containsAll(numbers);
         System.out.println("Subset:"+sub);

         

    }
}
