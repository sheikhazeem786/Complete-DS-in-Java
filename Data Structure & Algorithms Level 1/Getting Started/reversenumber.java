import java.util.*;
public class reversenumber{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        while(n!=0){
        int q=n/10;
        int r=n%10;
        System.out.print(r);
        n=q;
        }
    }
}