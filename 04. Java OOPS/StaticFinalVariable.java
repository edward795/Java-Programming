class StaticFinalVariable{
    //static final int MAX=100;

    static final int MAX; 
    static {MAX=100;}   // --- static block
    public static void main(String[] args){
        System.out.println("Variable Is:"+MAX);
    }
}