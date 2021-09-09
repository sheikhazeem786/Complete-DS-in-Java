import java.util.*;
public class pattern5 {
    public static void main(String[] str) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int nsp=n/2;
        int nst=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=nsp;j++){
                System.out.print("\t");
            }
            for(int j=1;j<=nst;j++){
                System.out.print("*\t");
            }
            System.out.println();
            if(i<=n/2){
                nsp=nsp-1;
                nst=nst+2;
            }
            else{
                nsp=nsp+1;
                nst=nst-2;
            }
        }
    }
}
