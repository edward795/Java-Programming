class Point{
    int x;
    int y;
    //Explicit contructor declaration
    // Point(int a,int b){
    //     x=a;
    //     y=b;
    // }

    void print(){
        System.out.println("The values are x="+x+" y="+y);
    }
}

public class Constructor {
    public static void main(String[] args){
       //Point p=new Point(10,20);
       //Calling deafult contructor created by java,with default intialized values '0'
       Point p=new Point();
       p.print();
    }
}
