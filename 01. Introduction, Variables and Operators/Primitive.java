class Point{
    int x;
    int y;
}

class Primitive{
    public static void main(String[] args){
        Point p=new Point();
        p.x=10;
        p.y=20;
        System.out.println("The coordinate is:"+p.x+" "+p.y);
    }
}