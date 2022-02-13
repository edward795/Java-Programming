class Base{
    final void func(){
        System.out.println("From Base Class");
    }
}

class Child extends Base{
    final void func(){             // -- overiding is not posible
        System.out.println("From Child Class");
    }
}

class FinalMethods{
    public static void main(String[] args){
        Child c=new Child();
        c.func();
    }
}

