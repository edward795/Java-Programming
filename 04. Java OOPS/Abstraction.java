import java.io.*;

abstract class Shape{
    String color;

    abstract double area();
    public abstract String toString();

    public Shape(String color){
        this.color=color;
        System.out.println("Shape constructor called!");
    }

    public String getColor(){
        return color;
    }
}

class Circle extends Shape{
    double radius;

    public Circle(String color,double radius){
        super(color);
        this.radius=radius;
        System.out.println("Circle class constructor called!");
    }

    @Override double area(){
        return Math.PI*Math.pow(radius,2);
    }

    @Override public String toString(){
        return ("Circles color is: "+super.getColor()+" and the area is: "+area());
    }
}

class Abstraction{
    public static void main(String[] args){
        Circle c1=new Circle("Red",4);
        System.out.println(c1.toString());
    }
}