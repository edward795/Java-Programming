import javax.swing.text.html.StyleSheet;

class FinalReferenceVariable{
    public static void main(String[] args){
        final StringBuffer sb =new StringBuffer("Edward");
        System.out.println(sb);
        sb.append("Elric"); 

        //sb=new StringBuffer("Apple");  -- repointing not allowed
        System.out.println(sb);
    }
}