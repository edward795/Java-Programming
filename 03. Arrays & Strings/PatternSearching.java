import java.util.Scanner;
public class PatternSearching {
    public static void main(String[] args){
        System.out.println("Enter the text:");
        Scanner sc=new Scanner(System.in);
        String txt=sc.next();
        System.out.println("Enter the pattern:");
        String pat=sc.next();

        patternSearch(txt, pat);

    }

    public static void patternSearch(String text,String patt){
        int pos=text.indexOf(patt);
        while(pos>=0){
            System.out.println(pos+" ");
            pos=text.indexOf(patt,pos+1);
        }
    }
}
