class CPU{
    double price;
    
    class Processor{
        String Manufacturer;
        double cores;
        
        double getCache(){
            return 3.2;
        }
    }

    class RAM{
        String Manufacturer;
        double memory;

        double getClockSpeed(){
            return 4.1;
        }
    }


}

public class NetsedClass {
    public static void main(String[] args){
        CPU cpu=new CPU();

        CPU.Processor processor=cpu.new Processor();

        CPU.RAM ram=cpu.new RAM();

        System.out.println("CPU Cache:"+processor.getCache());
        System.out.println("Clock Speed:"+ram.getClockSpeed());
    }
}
