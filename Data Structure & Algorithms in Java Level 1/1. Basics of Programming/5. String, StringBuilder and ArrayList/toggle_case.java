import java.util.*;
public class toggle_case {
    public static String toggleCase(String str) {
        StringBuilder sb=new StringBuilder(str);
        for(int i=0;i<sb.length();i++){
            char ch=sb.charAt(i);

            if(ch>='A' && ch<='Z'){
                ch=(char)(ch+'a'-'A');
            }else{
                ch=(char)(ch+'A'-'a');
            }

            sb.setCharAt(i, ch);
        }

        return sb.toString();
    }


    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String str= scn.next();
        System.out.println(toggleCase(str));
    }
}
