class Methods_With_Parameters{
    public static void main(String[] args){
        int x=5;
        System.out.println("Inside Main! value of x:"+x);
        func(x);
        System.out.println("After func() call value of x:"+x);
    }

    public static void func(int x){
        x=x+5;
    }
}