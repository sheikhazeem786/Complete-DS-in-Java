import java.util.*;
public class stringBuilder_intro {
    public static void main(String[] args){

        long start=System.currentTimeMillis();
        System.out.println(start);
        String s="";
        for(int i=0;i<100000;i++){
            s+=i;
        }
        // StringBuilder sb=new StringBuilder();
        // for(int i=0;i<10000000;i++){
        //     sb.append(i);
        // }
        long end=System.currentTimeMillis();
        System.out.println(end);
        System.out.println(end-start);

        // StringBuilder sb=new StringBuilder("hello");

        // char ch=sb.charAt(0);
        // System.out.println(sb);

        // sb.setCharAt(0, 'j');
        // System.out.println(sb);

        // sb.deleteCharAt(0);
        // System.out.println(sb);

        // sb.insert(0,'t');
        // System.out.println(sb);

        // String s=sb.toString();
        // System.out.println(s);
    }
}
