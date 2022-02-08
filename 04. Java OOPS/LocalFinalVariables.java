public class LocalFinalVariables {
    public static void main(String[] args){
        final int x;
        x=100;
        //x=200;   -- not possible
        System.out.println(x);
    }
}
