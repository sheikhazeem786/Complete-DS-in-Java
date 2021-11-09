import java.io.*;
import java.util.*;

public class printFactorial {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int fn=factorial(n);
        System.out.println(fn);
    }

    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        int fnm1=factorial(n-1);
        int fn=n*fnm1;
        return fn;
    }

}
