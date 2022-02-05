public class StringBuilderBufferMethods {
    public static void main(String[] args){
        StringBuilder sb=new StringBuilder("dcba");
        sb.reverse();
        System.out.println(sb);
        sb.append("efg");
        sb.setCharAt(1,'k');
        System.out.println(sb);
        sb.delete(0,2);
        System.out.println(sb);
        sb.insert(1,"efg");
        System.out.println(sb);
    }
}
