public class RuntimePolymorphism {
    public static void main(String[] args){
        Child c=new Child();
        System.out.println(c.printInfo());
    }
}


class Parent{
    public String name="Rahul";
    private int age=10; 

    public int getAge(){
        return age;
    }

    public void setAge(int newAge){
        this.age=newAge;
    }

    public String printInfo(){
        return ("Name:"+this.name+"\nAge:"+this.getAge());
    }
}

class Child extends Parent{
    public float cgpa=9.7f; 
    
    @Override
    public String printinfo(){
        return ("CGPA:"+this.cgpa);
    }

}