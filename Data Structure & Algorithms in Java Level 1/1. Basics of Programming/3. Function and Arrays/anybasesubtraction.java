import java.util.*;
  
  public class anybasesubtraction{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int b = scn.nextInt();
      int n1 = scn.nextInt();
      int n2 = scn.nextInt();
  
      int d = getSum(b, n1, n2);
      System.out.println(d);
   }
  
   public static int getSum(int b, int n1, int n2){
       // write ur code here
        int ans=0;
        int f=0;
        int c=0;
           while(n2>0){
            int r1=n1%10;
            n1=n1/10;
            int r2=n2%10;
            n2=n2/10;
            int d=r2-r1-c;
            if(d<0){
                c=1;
                d=d+b;
            }
            else{
                c=0;
            }
            ans=ans+d*(int)Math.pow(10,f);
            f++;
           }
       return(ans);
   }
}