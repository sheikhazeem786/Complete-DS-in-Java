import java.io.*;
import java.util.*;

public class permutationsOfString {

	public static void solution(String str){
		// write your code here
        int fact=factorial(str.length());
        for(int i=0;i<fact;i++){
            StringBuilder sb=new StringBuilder(str);
            int dvd=i;
            for(int div=str.length();div>=1;div--){
                int r=dvd%div;
                dvd=dvd/div;
                System.out.print(sb.charAt(r));
                sb.deleteCharAt(r);
            }
            System.out.println();
        }		
	}

    public static int factorial(int n) {
        int f=1;
        for(int i=2; i<=n; i++){
            f*=i;
        }
        return f;
    }
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
	}
    
}
