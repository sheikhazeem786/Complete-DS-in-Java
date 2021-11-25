import java.io.*;
import java.util.*;

public class getKPC {

    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        String str=scn.nextLine();
        
        ArrayList<String> res= getKPC(str);
        System.out.println(res);
    }

    static String codes[]={ ".;" , "abc" , "def" , "ghi" , "jkl" , "mno" , "pqrs" , "tu" , "vwx" , "yz" };

    //367
    public static ArrayList<String> getKPC(String str) {
        if(str.length()==0){
            ArrayList<String> bres=new ArrayList<>();
            bres.add("");
            return bres;
        }
       
        char ch=str.charAt(0); // 3
        String ros=str.substring(1); // 67
        ArrayList<String> rres= getKPC(ros); // pt, pu, qt, qu, rt, ru, st, su
        ArrayList<String> myRes=new ArrayList<>();
        int num=ch-48; // 3
        String code=codes[num]; // g h i
        for(int i=0;i<code.length();i++){
            char chCode=code.charAt(i);
            for(String ii:rres){ // pt, pu, qt, qu, rt, ru, st, su 
                myRes.add(chCode+ii);
            }  
        }

        return myRes;
    }

}