import java.io.*;
import java.util.*;

public class printEncodings {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        printEncodings(str,"");
    }

    public static void printEncodings(String str, String asf) {
        
        if(str.length()==0){
            System.out.println(asf);
            return;
        }else if(str.length()==1){ 
            String ch0 = str.substring(0,1);
            if(ch0.equals("0")){
                return;
            }
    
            int numForch0 = Integer.parseInt(ch0);
            String alphabetForch0 = (char)('a' + numForch0 - 1) + "" ;
            String roq0 = str.substring(1);
            printEncodings(roq0, asf+alphabetForch0);
        }else { // 2 or more length
            String ch0 = str.substring(0, 1);
            if(ch0.equals("0")){
                return;
            }

            int numForch0 = Integer.parseInt(ch0);
            String alphabetForch0 = (char)('a' + numForch0 -1) + "";
            String roq0 = str.substring(1);
            printEncodings(roq0, asf + alphabetForch0);

            // 2 number ka khel
            String ch01 = str.substring(0, 2);
            if(ch01.equals("0")){
                return;
            }

            int numForch01 = Integer.parseInt(ch01);
            if(numForch01<=26){
                String alphabetForch01 = (char)('a' + numForch01 -1) + "";
                String roq01 = str.substring(2);
                printEncodings(roq01, asf + alphabetForch01);
            }

        }
        

    }

}