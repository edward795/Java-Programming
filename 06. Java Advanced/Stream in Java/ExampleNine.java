import java.util.Map;
import java.util.Arrays.*;
import java.util.Arrays;
import java.util.stream.*;
import java.util.stream.Collectors.*;
import java.util.List;

class Student{
    String name;
    int roll;
    int marks;

    Student(String n,int r,int m){
        name=n;
        roll=r;
        marks=m;
    }

    public String getName(){ return name; }
    public int getRoll(){ return roll; }
    public int getMarks(){ return marks; }
}

public class ExampleNine {
    public static void main(String[] args){
        Student s[]={new Student("aac",110,78),new Student("aks",111,79),new Student("pkh",112,90)};
        Map<Integer,List<Student>> m = Arrays.stream(s) 
                                       .collect(Collectors.groupingBy(Student::getMarks));

        System.out.println("Map:"+m);
    }
}