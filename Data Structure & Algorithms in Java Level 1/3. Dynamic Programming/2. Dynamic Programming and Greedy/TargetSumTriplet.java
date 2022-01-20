import java.util.*;

public class TargetSumTriplet {
    
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int target=scn.nextInt();
        int n=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }

        Arrays.sort(arr);

        for(int i=0;i<arr.length;i++){
            int ntar=target-arr[i];

            int left=i+1;
            int right=arr.length-1;
            while(left<right){
                if(arr[left]+arr[right]>ntar){
                    right--;
                }
                else if(arr[left]+arr[right]<ntar){
                    left++;
                }
                else{
                    System.out.println(arr[i]+", "+arr[left]+", "+arr[right]);
                    left++;
                    right--;
                }
            }
        }
    }    
}