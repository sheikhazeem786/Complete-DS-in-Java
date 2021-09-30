import java.util.*;

public class arrayBaseMultiplication{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int b = scn.nextInt();
    int n1 = scn.nextInt();
    int n2 = scn.nextInt();

    int d = getProduct(b, n1, n2);
    System.out.println(d);
 }

 public static int getProduct(int b, int n1, int n2){
     // write your code here
     int ans=0;
     int f=0;
     while(n2>0){
         int d2=n2%10;
         n2/=10;
         int psd=getProductWithSingleDigit(b, n1, d2);
         ans=getSum(b, ans, psd*(int)Math.pow(10,f));
         f++;
     }
     return ans;
 }

 public static int getProductWithSingleDigit(int b, int n1, int d2){
    int c=0;
    int f=0;
    int ans=0;
    while(n1>0 || c>0){
        int d1=n1%10;

        n1/=10;

        int d=d1*d2+c;
        c=d/b;
        d%=b;
        ans=ans+d*(int)Math.pow(10,f);
        f++;
    }
    return ans;
 }

 public static int getSum(int b, int m1, int m2){
     int c=0;
     int f=0;
     int ans=0;
     while(m1>0 || m2>0 || c>0){
         int r1=m1%10;
         int r2=m2%10;

         m1/=10;
         m2/=10;

         int d=r1+r2+c;
         c=d/b;
         d%=b;
         ans=ans+d*(int)Math.pow(10, f);
         f++;
     }
     return ans;
 }

}