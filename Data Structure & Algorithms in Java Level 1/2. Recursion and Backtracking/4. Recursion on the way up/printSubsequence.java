import java.io.*;
import java.util.*;

public class printSubsequence {

    public static void main(String[] args) throws Exception {

        Scanner scn=new Scanner(System.in);
        String str=scn.nextLine();
        printSS(str, "");
    }

    public static void printSS(String ques, String asf) {
        if(ques.length()==0){
            System.out.println(asf);
            return;
        }

        char ch = ques.charAt(0);
        String roq = ques.substring(1);

        printSS(roq, asf + ch);
        printSS(roq, asf + "-");
    }

}