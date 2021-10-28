import java.util.*;
public class stringBuilder_intro {
    public static void main(String[] args){
        StringBuilder sb=new StringBuilder("hello");

        char ch=sb.charAt(0);
        System.out.println(sb);

        sb.setCharAt(0, 'j');
        System.out.println(sb);

        sb.deleteCharAt(0);
        System.out.println(sb);

        sb.insert(0,'t');
        System.out.println(sb);

        String s=sb.toString();
        System.out.println(s);
    }
}
