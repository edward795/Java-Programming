// public class ThisKeyword {
//     public static void main(String[] args){
//         Point p1=new Point(5,10);
//         Point p2=new Point(15,20);
    
//         p1.PrintInfo();
//         p2.PrintInfo();
//     }

    
// }

// class Point{
//     int x,y;
    
//     Point(int x,int y){
//         this.x=x;
//         this.y=y;
//     }

//     void PrintInfo(){
//         System.out.println("The Values of x and y are:"+x+":"+y);
//     }

// }


//chaining functions using 'this' keyword

// class Point{
//     int x,y;
//     Point(int x,int y){
//         this.x=x;
//         this.y=y;
//     }

//     Point setX(int x){
//         this.x=x;
//         return this;
//     }

//     Point setY(int y){
//         this.y=y;
//         return this;
//     }

//     void printInfo(){
//         System.out.println("The values of x & y are:"+x+":"+y); 
//     }
// }

// class ThisKeyword{
//     public static void main(String[] args){
//         Point p1=new Point(10,20);
//         Point p2=new Point(15,20);

//         p1.setX(2).setY(5);

//         p1.printInfo();
//     }
// }


//changing constructors using 'this' keyword

class Point{
    int x,y;

    Point(int x,int y){
        this.x=x;
        this.y=y;
    }

    Point(){
        this(10,10);
    }

    void printInfo(){
        System.out.println("The values are x:"+x+" y"+y);
    }
}

public class ThisKeyword{
    public static void main(String[] args){
        Point p1=new Point();
        p1.printInfo();
    }
}