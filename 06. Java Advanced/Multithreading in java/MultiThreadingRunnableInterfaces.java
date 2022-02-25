class Test implements Runnable{
    public void run(){
        System.out.println("Inside Test Thread.");
    }
}

public class MultiThreadingRunnableInterfaces {
    public static void main(String[] args){
        Thread t=new Thread(new Test());
        t.start();
        System.out.println("Inside Main Thread.");
    }
}
