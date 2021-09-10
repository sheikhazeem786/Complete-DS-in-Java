import java.util.*;
public class pattern15 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int nsp=n/2;
        int nst=1;
        int sp=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=nsp;j++){
                System.out.print(" ");
            }
            int val=sp;
            for(int j=1;j<=nst;j++){ 
                System.out.print(val);
                if(j<=nst/2){
                    val++;
                }
                else{
                    val--;
                }
                
            }
            if(i<=n/2){
                nsp--;
                nst+=2;
                sp++;
            }
            else{
                nsp++;
                nst-=2;
                sp--;
            }
            System.out.println();
        }
    }  
}
/*
  1
 232
34543
 232
  1
*/