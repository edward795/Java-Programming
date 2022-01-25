class Point{
    int x;
    int y;
}

class MethodsWithNonPrimitives{
    public static void main(String[] args){
       Point p=new Point();
       p.x=5;
       p.y=5;  

       System.out.println("Value after Function call: x="+p.x+" :y="+p.y);
       func(p);
       System.out.println("Value after Function call: x="+p.x+" :y="+p.y);
       
    }

    public static void func(Point p){
        p.x=10;
        p.y=10;
    }
}