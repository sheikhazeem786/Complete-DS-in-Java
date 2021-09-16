import java.util.*;
  
  public class decimaltoanybase{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b = scn.nextInt();
      int dn = getValueInBase(n, b);
      System.out.println(dn);
   }
  
   public static int getValueInBase(int n, int b){
       int f=0;
       int ans=0;
       while(n>0){
           int rem=n%b;
           n=n/b;
           ans=ans+rem*(int)Math.pow(10,f);
           f++;
        }
       return(ans);
    }
}