import java.util.Scanner;
public class Switch{
   
    public static void main(String[] args){
        int x=0;
        int y=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a character:");
        char c=sc.next().charAt(0);
        switch(c){
            case 'L':
                     x++;
                     break; 
            case 'R': 
                     x--;
                     break;
            case 'U':
                     y++;
                     break; 
            case 'D':
                    y--;
                    break;
            default: 
                    System.out.println("Invalid Input!");

        }
        System.out.println("current coordinates:"+x+" "+y);
    }
}