import java.util.*;
  
  public class anybasetoanybase{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int a = scn.nextInt();
      int b = scn.nextInt();
      int dn = getValueInBase(n, a, b);
      System.out.println(dn);
   }
  
   public static int getValueInBase(int n, int a, int b){
       int f=0;
       int ans=0;
       while(n>0){
           int rem=n%10;
           n=n/10;
           ans=ans+rem*(int)Math.pow(a,f);
           f++;
        }
        f=0;
        n=ans;
        ans=0;
       while(n>0){
           int rem=n%b;
           n=n/b;
           ans=ans+rem*(int)Math.pow(10,f);
           f++;
        }

       return(ans);
    }
}