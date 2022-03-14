import java.util.HashMap;
import java.util.Map.Entry;
import java.util.TreeMap;

public class HashMapExample {
    public static void main(String[] args){
        HashMap<String,Integer> hash=new HashMap<>(); //note: Key:Value --> Key here is String & Value is Integer eg: "Python" is key and '1' is value 
        
        //Add elements to a HashMap
        hash.put("Python",1);
        hash.put("JavaScript",2);
        hash.put("Java",3);
        hash.put("R",4);

        System.out.println("hashMap:"+hash); 

        // Access HashMap Elements
        Integer ele=hash.get("Python");
        System.out.println("Accessed Element:"+ele);

        System.out.println("Keys:"+hash.keySet());
        System.out.println("Values:"+hash.values());
        System.out.println("Key Value Pairs:"+hash.entrySet()); 

        //Change HashMap Value 

        hash.replace("Python",100);
        System.out.println("After Replacement:"+hash);
        
        //Remove HashMap Elements
        hash.remove("R");
        System.out.println("After Removal:"+hash);

        //iterating through HashMap 
        for(Integer item:hash.values()){
            System.out.println("Values:"+item);
        }
        
        for(String item:hash.keySet()){
            System.out.println("Keys:"+item);
        }

        for(Entry<String,Integer> item:hash.entrySet()){
            System.out.println("Key-Value Pairs:"+item);
        }

        //Creating HashMap From other Maps 
        TreeMap<Integer,String> evenNumbers=new TreeMap<>();
        evenNumbers.put(2,"two");
        evenNumbers.put(4,"four");
        evenNumbers.put(6,"six");
        
        HashMap<Integer,String> numbers=new HashMap<>(evenNumbers);
        numbers.put(3,"three");
        System.out.println("Tree Map:"+evenNumbers);
        System.out.println("Hash Map:"+numbers);

        //specifiying capacity and load factor while creating a HashMap 
        HashMap<Integer,String> Item = new HashMap<>(8,0.6f);   
        System.out.println(Item);

    }
}
