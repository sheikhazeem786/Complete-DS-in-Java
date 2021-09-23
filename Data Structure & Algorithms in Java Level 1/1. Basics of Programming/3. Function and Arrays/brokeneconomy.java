import java.io.*;
import java.util.*;

public class brokeneconomy{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn= new Scanner(System.in);
    int n=scn.nextInt();
    int[] a=new int[n];
    for(int i=0;i<a.length;i++){
        a[i]=scn.nextInt();
    }
    int d=scn.nextInt();
    int floor=-1;
    int ceil=-1;
    int left=0;
    int right=a.length-1;
    while(left<=right){
        int mid=(left+right)/2;
        if(d<a[mid]){
            right=mid-1;
            ceil=a[mid];
        }
        else if(d>a[mid]){
            left=mid+1;
            floor=a[mid];
        }
        else{
            ceil=a[mid];
            floor=a[mid];
            break;
        }
    }
    System.out.println(ceil);
    System.out.println(floor);

 }

}