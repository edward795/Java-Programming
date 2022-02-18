enum Size{
    SMALL,MEDIUM,LARGE,EXTRALARGE
}

class Test{
    Size pizzaSize;
    Test(Size pizzaSize){
        this.pizzaSize=pizzaSize;
    }

    public void OrderPizza(){
        switch(pizzaSize){
            case SMALL:
                System.out.println("I ordered a small Pizza.");
                break;
            case MEDIUM:
                System.out.println("I ordered a medium Pizza");
                break;
            default:
                System.out.println("I don't know which one to order.");
                break;
        }
    }
}


public class EnumClasses {
    public static void main(String[] args){
        Test t1=new Test(Size.MEDIUM);
        t1.OrderPizza();
    }
}
