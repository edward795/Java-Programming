import java.util.*;
import java.io.*;

public class LinkedlistExample {
    public static void main(String[] args){
        List<Integer> numbers=new LinkedList<Integer>();
        LinkedList<String> names=new LinkedList<String>(); 

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        names.add("Ram");
        names.add("Ameer");
        names.add("Christy");

        System.out.println("List of Numbers:"+numbers+"\nList of names:"+names);
        names.remove("Ram");
        System.out.println(names);

    }
}
