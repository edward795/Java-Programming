class TypeConversion{
    public static void main(String[] args){
        int x=10;
        long y=x;
        float z=y;

        System.out.println("Widening or Implicit Conversion:"+x+" "+y+" "+z);

        double d=65.4;
        int i=(int)d;
        char c=(char)i;

       System.out.println("Narrowing or Explicit Type Conversion:"+x+" "+y+" "+z);
        
    }
}