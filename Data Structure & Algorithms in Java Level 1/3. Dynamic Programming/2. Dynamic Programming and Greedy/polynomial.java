import java.util.*;

public class polynomial{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int x=scn.nextInt();
        int n=scn.nextInt();
        System.out.println(poly(x,n)); 
    }

    public static int poly(int x, int n) {
        int pox=x;
        int ans=0;
        while(n>=1){
            int term=n*pox;
            ans=ans+term;
            n--;
            pox=pox*x;
        }
        return ans;
    }
}