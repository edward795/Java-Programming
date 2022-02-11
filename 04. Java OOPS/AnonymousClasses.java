// class Polygon{
//     public void display(){
//         System.out.println("Inside the Ploygon class");
//     }
// }

// class AnonymousDemo{
//     public void createClass(){
//         Polygon p1= new Polygon(){
//             public void display(){
//                 System.out.print("Inside the Anonymous class");
//             }
//         };
//         p1.display();
//     }
// }


// public class AnonymousClasses {
//     public static void main(String[] args){
//       AnonymousDemo an = new AnonymousDemo();
//       an.createClass();
//     }
// }

//Method 2

interface Polygon{
    public void display();
}

class AnonymousDemo{
    public void createClass(){
        Polygon p1=new Polygon(){
            public void display(){
                System.out.println("Inside Anonymous Class!");
            }
    };
    p1.display();
}
}
public class AnonymousClasses{
    public static void main(String[] args){
        AnonymousDemo an=AnonymousDemo();
        an.createClass();
    }
}