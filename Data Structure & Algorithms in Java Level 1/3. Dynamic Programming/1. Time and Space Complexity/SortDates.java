import java.io.*;
import java.util.*;

public class SortDates {

  public static void sortDates(String[] arr) {
    
    // date
    countSort(arr, 1000000, 100, 32); // 0 to 31 indexes for farr
    
    //month
    countSort(arr, 10000, 100, 13); // 0 to 12 indexes for farr
    
    //year    
    countSort(arr, 1, 10000, 2501); // 0 to 2500 indexes for farr
  }

  public static void countSort(String[] arr,int div, int mod, int range) {
    
    // creating frequency array and answer array
    int[] farr=new int[range];
    String[] ans=new String[arr.length];

    // collecting the frequencies
    for(int i=0;i<arr.length;i++){
        int val= Integer.parseInt(arr[i]) / div % mod;
        farr[val]++;
    }

    // convert the freq to psa
    for(int i=1;i<farr.length;i++){
        farr[i]+=farr[i-1];
    }

    // fill the ans
    for(int i=arr.length-1;i>=0;i--){
        int val=Integer.parseInt(arr[i]) / div % mod;
        int pos=farr[val];
        ans[pos-1]=arr[i];
        farr[val]--;
    }
 
    // fill the original array
    for(int i=0;i<ans.length;i++){
        arr[i]=ans[i];
    }
  }

  public static void print(String[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    String[] arr = new String[n];
    for (int i = 0; i < n; i++) {
      String str = scn.next();
      arr[i] = str;
    }
    sortDates(arr);
    print(arr);
  }

}