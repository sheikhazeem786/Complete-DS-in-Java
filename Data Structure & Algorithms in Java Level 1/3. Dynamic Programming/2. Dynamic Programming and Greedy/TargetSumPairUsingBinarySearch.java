import java.util.*;

public class TargetSumPairUsingBinarySearch {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int target=scn.nextInt();
        int n=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }

        //sort
        Arrays.sort(arr);

        //binary search the compliment
        for(int i=0;i<arr.length;i++){
            int theOtherNumber=target-arr[i];

            if(theOtherNumber<arr[i]){
                break;
            }

            int left=i+1, right=arr.length-1;
            while(left<=right){
                int mid=(left+right)/2;
                if(theOtherNumber<arr[mid]){
                    right=mid-1;
                }else if(theOtherNumber>arr[mid]){
                    left=mid+1;
                }else{
                    System.out.println(arr[i]+", "+arr[mid]);
                    break;
                }
            }
        }
    }    
}
