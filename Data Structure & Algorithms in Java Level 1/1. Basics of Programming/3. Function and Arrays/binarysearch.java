import java.util.*;
public class binarysearch {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
        int data=scn.nextInt();
        int l=0;
        int r=arr.length-1;
        int foundAt=-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(data<arr[mid]){
                r=mid-1;
            }
            else if(data>arr[mid]){
                l=mid+1;
            }
            else{
                foundAt=mid;
                break;
            }
        }
        System.out.println(foundAt);
    }
}
