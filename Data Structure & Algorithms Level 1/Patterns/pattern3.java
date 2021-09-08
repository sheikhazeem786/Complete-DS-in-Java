import java.util.*;
public class pattern3 {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int nspace=n-1;
        int nstar=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=nspace;j++){
                System.out.print("\t");
            }
            for(int j=1;j<=nstar;j++){
                System.out.print("*\t");
            }
            System.out.println();
            nspace--;
            nstar++;
        }
    }
}
/*
//Another format
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for (int i = 1; i <= n; i++)
        {
            for (int j = i; j < n; j++)
            {
                System.out.print("\t");
            }
            for (int j = 1; j <= i; j++)
            {
                System.out.print("*\t");
            }
            System.out.println ();
        }       
    }
}*/