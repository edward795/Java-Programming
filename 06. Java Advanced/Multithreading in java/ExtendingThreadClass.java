



    
 class Test extends Thread{
        public void run(){
            System.out.println("From Test Thread.");
        }
    }


    
public class ExtendingThreadClass {
    public static void main(String[] args){
         Test t=new Test();
         t.start();
         System.out.println("From main thread.");
    } 

}