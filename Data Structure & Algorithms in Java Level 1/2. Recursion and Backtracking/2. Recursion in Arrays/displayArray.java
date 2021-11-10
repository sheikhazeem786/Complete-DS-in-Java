import java.io.*;
import java.util.*;

public class displayArray {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
        displayArr(arr, 0);
    }

    public static void displayArr(int[] arr, int i){
        if(i==arr.length) return;
        System.out.println(arr[i]);
        displayArr(arr, i+1);
    }

}