import java.io.*;
import java.util.*;

public class subarray{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
    int[] a=new int[n];
    for(int i=0;i<a.length;i++){
        a[i]=scn.nextInt();
    }
    for(int si=0;si<a.length;si++){
        for(int ei=si;ei<a.length;ei++){
            for(int i=si;i<ei;i++){
                System.out.println(a[i]+"\t");
            }
            System.out.println();
        }
    }
 }

}