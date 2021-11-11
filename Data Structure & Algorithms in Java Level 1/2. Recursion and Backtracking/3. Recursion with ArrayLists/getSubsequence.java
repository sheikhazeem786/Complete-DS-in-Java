import java.io.*;
import java.util.*;

public class getSubsequence {

    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        String str=scn.next();
        ArrayList<String> ss= gss(str);
        System.out.println(ss);
    }

    // E -> gss(abc)= [... , ..c , .b. , .bc , a.. , a.c , ab. , abc]
    // F -> gss(bc)= [.. , .c , b. , bc]
    // EwF -> gss(abc)= [.+gss(bc)] + [a+gss(bc)]
    public static ArrayList<String> gss(String str) {
        if(str.length()==0){
            ArrayList<String> bres=new ArrayList<>();
            bres.add("");
            return bres;

        }
        char ch=str.charAt(0);
        String ros=str.substring(1);
        ArrayList<String> rres=gss(ros);
        ArrayList<String> sres= new ArrayList<>();
        for(String rstr:rres){
            sres.add(rstr);
        }

        for(String rstr:rres){
            sres.add(ch+rstr);
        }
        return  sres;
    }

}