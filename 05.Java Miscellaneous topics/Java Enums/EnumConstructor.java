enum Size{

    SMALL("This is small"),
    MEDIUM("This is medium"),
    LARGE("This is large"),
    EXTRALARGE("This is extralarge");

    private final String pizzaSize;

    private Size(String pizzaSize){
        this.pizzaSize=pizzaSize;
    }

    public String getSize(){
        return pizzaSize;
    }

}


class EnumConstructor{

    public static void main(String[] args){
        Size s=Size.SMALL;
        System.out.println(s.getSize());
    }
}