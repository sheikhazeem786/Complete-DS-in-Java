import java.io.*;
import java.util.*;

public class maxArray {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
        int max=maxOfArray(arr, 0);
        System.out.println(max);
    }

    public static int maxOfArray(int[] arr, int i){
        if(i==arr.length-1){
            return arr[i];
        }
        int misa=maxOfArray(arr, i+1);
        if(arr[i]>misa){
            return arr[i];
        }else{
            return misa;
        }
    }

}