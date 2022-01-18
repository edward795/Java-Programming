import java.util.Scanner;
import java.lang.*;
class Formatsunc{
********    public static void main(String[] args){
        int x=100,y=200;
        System.out.format("Value of x:%d\n",x);
        System.out.format("Value of y:%d\n",y);
        double f=Math.PI;
        System.out.format("Value of PI:%.2f\n",f);
        System.out.format("Value of PI:%5.2f\n",f);
        System.out.format("Value of PI:%05.2f\n",f);
        System.out.format("Value of x=%d,y=%d",x,y);
 
    }
}