import java.lang.Class;
import java.lang.reflect.*;

class Animal{

}


class Dog extends Animal{
    public void display(){
        System.out.println("I am a dog.");
    }
}


public class ClassReflection {
    public static void main(String[] args){
        Dog d1= new Dog();

        Class obj=d1.getClass();    
        String name=obj.getName();  
        System.out.println("Name:"+name);

        int modifier=obj.getModifiers();

        String mod=Modifier.toString(modifier); 
        System.out.println("Modifier:"+mod);

        Class superclass=obj.getSuperclass();
        System.out.println("Super Class:"+superclass.getName());
    }
}
