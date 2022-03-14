import java.util.LinkedHashMap;

public class LinkedHashMapExample {
    public static void main(String[] args){
        LinkedHashMap<Integer,String> evenNumbers=new LinkedHashMap<>(8,0.6f,true);
        evenNumbers.put(2,"two");
        evenNumbers.put(4,"four");
        evenNumbers.put(6,"six");
         
        System.out.println("Even Numbers:"+evenNumbers); 

        LinkedHashMap<Integer,String> numbers=new LinkedHashMap<>(8,0.6f,true);
        numbers.put(3,"three"); 
        numbers.putAll(evenNumbers); 

        System.out.println("Numbers:"+numbers);

        numbers.putIfAbsent(3, "three");
        numbers.putIfAbsent(6, "six");

        System.out.println("Numbers:"+numbers);

        //accessing elements 
        System.out.println("key/value:"+numbers.entrySet());
        System.out.println("values:"+numbers.values());
        System.out.println("keys:"+numbers.keySet());

        //get & getOrdefault 
        String num=numbers.get(2);
        System.out.println("get Value:"+num);

        String numd=numbers.getOrDefault(6,"Apple");
        System.out.println("getdefault Value:"+numd);
        
        //Remove Elements 
        String rvalue=numbers.remove(2);
        System.out.println("Removed Value:"+rvalue); 
        
        System.out.println("Removed Value:"+numbers.remove(2,"two"));

    }
}
