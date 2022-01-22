import java.util.*;

public class printSubsequenceWithAL {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String str=scn.nextLine();
        ArrayList<String> acount=new ArrayList<>();
        pss(str,"", acount);
        System.out.println(acount);
    }    

    public static void pss(String ques, String asf, ArrayList<String> acount) {
        
        if(ques.length()==0){
            acount.add(asf);
            return;
        }
        char ch=ques.charAt(0);
        String roq=ques.substring(1);

        pss(roq, asf+ch, acount);
        pss(roq, asf, acount);
    }
}
