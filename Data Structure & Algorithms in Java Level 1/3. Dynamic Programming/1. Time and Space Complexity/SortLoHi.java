import java.util.*;

public class SortLoHi {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
        int lo=scn.nextInt();
        int hi=scn.nextInt();
        sort(arr,lo,hi);
        print(arr);
    }    

    public static void sort(int[] arr, int lo, int hi) {
        
        int i=0,j=0;
        int k=arr.length-1;
        while(i<=k){
            if(arr[i]<lo){ // 0
                swap(arr, i, j);
                i++;
                j++;
            }else if(arr[i]>=lo && arr[i]<hi){ // 1
                i++;
            }else{ // 2
                swap(arr, i, k);
                k--;
            }
        }
    }
    public static void swap(int[] arr, int i, int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void print(int[] arr) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    
}
