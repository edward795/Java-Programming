class Motherboard{
    static class USB{
        int usb2=2;
        int usb3=1;

        int getTotalPorts(){
            return usb2+usb3;
        }
    }
}

public class StaticNestedClass {
    public static void main(String[] args){
        Motherboard.USB usb = new Motherboard.USB();

        System.out.println("No of usb ports is:"+usb.getTotalPorts());
    }
}
