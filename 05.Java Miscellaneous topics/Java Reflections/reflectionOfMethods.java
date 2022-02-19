import java.lang.Class; 
import java.lang.reflect.*;

class Dog{
    public void display(){
        System.out.println("I am a dog.");
    }

    private void makeSound(){
        System.out.println("Bark Bark.");
}
}

public class reflectionOfMethods {
    public static void main(String[] args){
        Dog d1=new Dog();

        Class obj=d1.getClass();    

        Method[] methods=obj.getDeclaredMethods();

        for(Method m:methods){
            System.out.println("Method name:"+m.getName());

            int modifier=m.getModifiers();
            System.out.println("Modifier:"+Modifier.toString(modifier));

            System.out.println("Return Types:"+m.getReturnType());
            System.out.println(" ");
        }
    
    }
}

