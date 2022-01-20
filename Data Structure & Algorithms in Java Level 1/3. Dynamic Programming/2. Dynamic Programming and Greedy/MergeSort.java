import java.util.*;

public class MergeSort {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }

        arr=mergeSort(arr,0,arr.length-1);
        for(int val:arr){
            System.out.println(val+" ");
        }
    }
    
    public static int[] mergeSort(int[] arr, int lo, int hi) {
        
        if(lo==hi){
            int[] ba=new int[1];
            ba[0]=arr[lo];
            return ba;
        }

        int mid=(lo+hi)/2;
        int[] firstSort = mergeSort(arr, lo, mid);
        int[] secondSort = mergeSort(arr, mid+1, hi);
        int[] ans = merge2SortedArray(firstSort, secondSort);
        return ans;
    }

    public static int[] merge2SortedArray(int[] a, int[] b) {
        
        int[] ans=new int[a.length+b.length];
        int i=0;
        int j=0;
        int k=0;
        while(i < a.length && j < b.length){
            if(a[i]<b[j]){
                ans[k]=a[i];
                k++;
                i++;
            }else{
                ans[k]=b[j];
                k++;
                j++;
            }
        }

        if(i==a.length){
            while(j<b.length){
                ans[k]=b[j];
                k++;
                j++;
            }
        }
        else{
            while(i<a.length){
                ans[k]=a[i];
                k++;
                i++;
            }
        }

        return ans;
    }
}
