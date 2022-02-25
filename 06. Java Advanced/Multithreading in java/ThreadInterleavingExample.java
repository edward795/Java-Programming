class Test extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Thread from Test Class.");
        }
    }
}

public class ThreadInterleavingExample{
    public static void main(String[] args) throws InterruptedException{
         Test t=new Test();
         t.start();

         for(int i=0;i<5;i++){
             System.out.println("Thread from Main Class.");
             Thread.sleep(1);
         }
    }
}
