import java.util.Set; 
import java.util.HashSet;

public class SetExample {
    public static void main(String[] args){
        Set<Integer> numbers=new HashSet<>(); 
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);

        System.out.println("Set:"+numbers);

        Set<Integer> evenNumbers=new HashSet<>(); 
        evenNumbers.add(2);
        evenNumbers.add(4);
        evenNumbers.add(6); 

        System.out.println("Even Set:"+evenNumbers);

        numbers.addAll(evenNumbers);
        System.out.println("Union Of Sets:"+numbers);
    }
}
