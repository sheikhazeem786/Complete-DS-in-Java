import java.io.*;
import java.util.*;

public class printKPC {

    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        String str=scn.nextLine();
        
        printKPC(str,"");
    }

    static String codes[]={ ".;" , "abc" , "def" , "ghi" , "jkl" , "mno" , "pqrs" , "tu" , "vwx" , "yz" };

    public static void printKPC(String str, String asf) {
        
        if(str.length()==0){
            System.out.println(asf);
            return;
        }
       
        char ch=str.charAt(0); // 3
        String ros=str.substring(1); // 67

       
        String code=codes[ch-48]; // g h i
        for(int i=0;i<code.length();i++){
            char chCode=code.charAt(i);
            printKPC(ros, asf+chCode);
            }  
        }
    }