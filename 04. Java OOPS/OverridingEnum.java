enum SIZE{
    //   SMALL,MEDIUM,LARGE,EXTRALARGE;  

    SMALL{
        public String toString(){
            return "The Size is Small";
        }
    },

    MEDIUM{
        public String toString(){
            return "The Size is Medium";
        }
    }

    
}


public class OverridingEnum {
    public static void main(String[] args){
        // System.out.println("The value of SMALL is:"+Size.SMALL.toString()); 
        //System.out.println("The value of LARGE is:"+Size.LARGE.name());

        System.out.println("The value of Medium is:"+SIZE.MEDIUM.toString());
    }
}
