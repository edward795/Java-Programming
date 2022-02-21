import java.lang.Class;
import java.lang.reflect.*;

class Dog{
    public Dog(){

    }

    private Dog(int age){
        
    }
}


public class reflectionOfConstructors {
   public static void main(String[] args){
      Dog d1=new Dog();
      Class obj=d1.getClass();

      Constructor[] constructors=obj.getDeclaredConstructors();

      for(Constructor c:constructors){
          System.out.println("Constructor Name :"+c.getName());

          int modifier=c.getModifiers();

          String mod=Modifier.toString(modifier);
          System.out.println("Modifier:"+mod);

          System.out.println("Parameters:"+c.getParameterCount());
          System.out.println(" ");
      }
   }  

}
