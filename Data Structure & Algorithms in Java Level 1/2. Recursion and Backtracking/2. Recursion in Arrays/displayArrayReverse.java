import java.io.*;
import java.util.*;

public class displayArrayReverse {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn= new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
        displayArrReverse(arr, 0);
    }

    public static void displayArrReverse(int[] arr, int i) {
        if(i==arr.length) return;
        displayArrReverse(arr, i+1);
        System.out.println(arr[i]);
    }

}
