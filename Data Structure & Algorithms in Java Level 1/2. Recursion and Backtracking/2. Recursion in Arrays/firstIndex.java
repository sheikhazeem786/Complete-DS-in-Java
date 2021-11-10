import java.io.*;
import java.util.*;

public class firstIndex {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
        int x=scn.nextInt();
        System.out.println(firstIndex(arr, 0, x));
    }

    public static int firstIndex(int[] arr, int i, int x){
        
        if(i==arr.length) return -1;
        if(arr[i]==x){
            return i;
        }
        else{
            int first=firstIndex(arr, i+1, x);
            return first;
        }

    }

}