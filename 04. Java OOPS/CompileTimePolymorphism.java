public class CompileTimePolymorphism {
    public static void main(String[] args){
        System.out.println(Method1.multiply(10, 10));
        System.out.println(Method1.multiply(5.5,6.3));

        System.out.println(Method2.multiply(10, 15));
        System.out.println(Method2.multiply(11, 12,13));
      
      }
    

    
  // Java program for Method overloading
  class Method1{
    static int multiply(int a,int b){
         return a*b;
    }

    static double multiply(double a,double b){
         return a*b;
    }
   }  

   class Method2{
     static int multiply(int a,int b){
       return a*b;
     }

     static int multiply(int a,int b,int c){
       return a*b*c;
     }
   }


}
