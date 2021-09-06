import java.util.*;

public class isPrime {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int t=scn.nextInt();
        for(int i=0;i<t;i++){
            int n=scn.nextInt();
            int div=2;
            boolean prime=true;
            while(div*div<=n){
                int rem=n%div;
                if(rem==0){
                    prime=false;
                    break;
                }
                div++;
            }
            if(prime==false){
                System.out.println("Not Prime");
            }
            else{
                System.out.println("Prime");
            }
        }
    }
}
