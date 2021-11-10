import java.io.*;
import java.util.*;

public class lastIndex {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
        int x=scn.nextInt();
        System.out.println(lastIndex(arr, 0, x));
    }

    public static int lastIndex(int[] arr, int i, int x){
        
        if(i==arr.length) return -1;
        int li=lastIndex(arr, i+1, x);
        if(li==-1){
            if(arr[i]==x){
                return i;
            }
            else{
                return -1;
            }
        }
        else{
            return li;
        }
        
    }

}
