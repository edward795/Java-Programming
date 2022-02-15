import java.io.*;

interface Vehicle{
    void changeGear(int a);
    void speedUp(int a);
    void applyBrakes(int a);
}

class Bicycle implements Vehicle{
    int speed;
    int gear;

    @Override 
    public void changeGear(int newGear){
        gear=newGear;
        }

    @Override 
    public void speedUp(int increment){
        speed+=increment;
    }

    @Override
    public void applyBrakes(int decrement){
        speed-=decrement;
    }

    public void printStates(){
        System.out.println("The present values of the bicycle are => speed : "+speed+" gear : "+gear);
    }
}

public class InterfacesDemo {
    public static void main(String[] args){
        Bicycle b=new Bicycle();
        b.changeGear(2);
        b.speedUp(5);
        b.applyBrakes(2);

        System.out.println("Present State:");
        b.printStates();
    }
}
