import java.util.HashSet;
import java.util.Iterator;


public class HashSetExample {
    public static void main(String[] args){
        HashSet<Integer> numbers=new HashSet<>(); 

        HashSet<Integer> evenNumbers=new HashSet<>(); 
        
        //insert to HashSet
        evenNumbers.add(2);
        evenNumbers.add(4);
        evenNumbers.add(6);
        
        //accessing HashSet 
        Iterator<Integer> iter = evenNumbers.iterator(); 
        
        System.out.println("Accessing Elements:");
        while(iter.hasNext()){
            System.out.print(iter.next());
            System.out.print(" ");
        }

          //remove Elements 
        boolean stat=evenNumbers.remove(6);
        System.out.println("Is Element 6 removed?:"+stat);


        //Set Operations
        //Union of Sets 
        numbers.add(1);
        numbers.add(5);
        numbers.add(3);
        numbers.add(6);
        System.out.println("set1:"+numbers);
        System.out.println("set2:"+evenNumbers);
        numbers.addAll(evenNumbers);
        System.out.println("Union:"+numbers);

        //intersection
        evenNumbers.retainAll(numbers);
        System.out.println("Intersection:"+evenNumbers);
        

        numbers.add(2);
        //difference of 2 sets 
        evenNumbers.removeAll(numbers);
        System.out.println("difference Numbers:"+evenNumbers);

        //subset 
        boolean res=numbers.containsAll(evenNumbers);
        System.out.println("Subset:"+res);
    }
}
