import java.util.Stack;

public class StackExample {
    public static void main(String[] args){
        Stack<String> s=new Stack<String>();

        s.push("apple");
        s.push("orange");
        s.push("kiwi");
        s.add("grapes");
        
        System.out.println("Stack:"+s);
        
        String str=s.pop();
        System.out.println("The popped Elemt is:"+str);

        String p=s.peek();
        System.out.println("The element at the top is:"+p);

        int pos=s.search("kiwi");
        System.out.println("The position of kiwi is:"+pos); 

        boolean emp=s.empty();
        System.out.println("Is Stack empty:"+emp);
        
    }
}
