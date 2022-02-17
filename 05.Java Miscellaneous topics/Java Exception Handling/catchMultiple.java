public class catchMultiple {
    public static void main(String[] args){
        int[] arr={9,8,7,6,5,4};

        try{
            int c=arr[6]/0;
        }
        catch(ArithmeticException | ArrayIndexOutOfBoundsException e){
            System.out.println("Error Occured!!:"+e.getMessage());
        }
    }
}
