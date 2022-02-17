public class ExampletryCatchFinally {
    public static void main(String[] args){
        try{
            test();
        }
        catch (Exception e){
            System.out.println("Error Occured:"+e.getMessage());
        }
        finally{
            System.out.println("Finally block executed!");
        }
    }

    public static void test(){
        int a=5/0;
        System.out.println("Divide 5 by 0;");
    }
}
