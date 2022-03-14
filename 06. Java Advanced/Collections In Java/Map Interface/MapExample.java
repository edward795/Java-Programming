import java.util.Map; 
import java.util.HashMap;

public class MapExample {
    public static void main(String[] args){
        Map<String,Integer> map=new HashMap<>();

        map.put("first",1);
        map.put("second",2);
        map.put("third",3);
        
        System.out.println("Map:"+map);

        map.replace("second",4);
        System.out.println("After Replaceing:"+map);

        int value=map.remove("first");
        System.out.println("The removed value is:"+value); 

    }
}
