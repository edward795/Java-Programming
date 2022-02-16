public class throwsMultiple {
    public static void main(String[] args){
        try{
            arrayDiv();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        
  }  

  public static void arrayDiv() throws ArithmeticException,IndexOutOfBoundsException{
      int[] arr={9,8,7,6,5,4};
      int c=arr[6]/0;
      System.out.println(c);
  }
}
