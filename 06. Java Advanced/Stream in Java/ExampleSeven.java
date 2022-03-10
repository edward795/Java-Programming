import java.util.Arrays;
import java.util.*;

class Student{
    int roll;
    int marks;
    String name;

    Student(int i,String n,int m){
        roll=i;
        name=n;
        marks=m;

    }

    int getRoll(){ return roll;} 
    String getName(){ return name; }
    int getMarks(){ return marks; } 


}

public class ExampleSeven {
    public static void main(String[] args){
        Student arr[] = {new Student(110,"bbd",78),new Student(111,"bkd",89),new Student(112,"aac",90)};
        
        double av=Arrays.stream(arr) 
                        .mapToInt(x->x.getMarks())
                        .average() 
                        .getAsDouble(); 
        System.out.println(av);
    }
}
