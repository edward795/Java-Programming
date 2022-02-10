
public class Encapsulation {
    
    public String name="Arun";
    private float cgpa=9.7f;
    public static void main(String[] args){
       Student s1=new Student();
       System.out.println(s1.name);
       System.out.println(s1.getCGPA());  // private member getter()
       s1.setCGPA(8.8f);
       System.out.println(s1.getCGPA());
  
    }
}

class Student{
    public String name="arun";
    private float cgpa=9.7f;

    public float getCGPA(){
        return this.cgpa;
    }

    public void setCGPA(float newCGPA){
        this.cgpa=newCGPA;
    }
}