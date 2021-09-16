import java.util.*;
public class rotatenumber{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int k=scn.nextInt();
        int nod=0;
        int temp=n;
        while(temp!=0){
            temp/=10;
            nod++;
        }
        k=k%nod;
        if(k<0){
            k=k+nod;
        }
        int mul=1;
        int div=1;
        for(int i=1;i<=nod;i++){
            if(i<=k){
                div*=10;
            }
            else{
                mul*=10;
            }
        }
        int q=n/div;
        int r=n%div;
        int ans=r*mul+q;
        System.out.println(ans);
    }
    
}
