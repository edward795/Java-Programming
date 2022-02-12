class Bicycle{
    public int gear;
    public int speed;

    public Bicycle(int gear,int speed){
        this.gear=gear;
        this.speed=speed;
    }

    public void applyBrake(int decrement){
        this.speed-=decrement;
    }

    public void speedUp(int increment){
        this.speed+=increment;
    }

    public String PrintData(){
        return ("No of gears:"+this.gear
        +"\nspeed:"+this.speed);
    }
}


class MountainBike extends Bicycle{
   public int seatHeight;
   public MountainBike(int gear,int speed,int seatHeight){
       super(gear,speed);
       seatHeight=seatHeight;
    }

    public void setHeight(int newValue){
        seatHeight=newValue;
    }

    public String PrintData(){
        return (super.PrintData()+"\nSeat Height:"+this.seatHeight);
    }
}




public class Inheritance{
    public static void main(String[] args){
        MountainBike b=new MountainBike(20, 200, 45);
        System.out.println(b.PrintData());
        b.speedUp(20);
        b.setHeight(22);
        System.out.println(b.PrintData());

    }
}