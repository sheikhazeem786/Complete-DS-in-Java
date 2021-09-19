import java.util.*;
public class differenceoftwoarrays {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n1=scn.nextInt();
        int[] arr1=new int[n1];
        for(int i=0;i<arr1.length;i++){
            arr1[i]=scn.nextInt();
        }
        int n2=scn.nextInt();
        int[] arr2=new int[n2];
        for(int i=0;i<arr2.length;i++){
            arr2[i]=scn.nextInt();
        }
        int[] diff=new int[n2];
        int i=arr1.length-1;
        int j=arr2.length-1;
        int k=diff.length-1;
        int b=0;
        while(k>=0){
            int d=arr2[j]-b;
            if(i>=0){
                d=d-arr1[i];
            }
            if(d<0){
                d=d+10;
                b=1;
            }
            else{
                b=0;
            }
            diff[k]=d;
            i--;
            j--;
            k--;
        }
        int idx=0;
        while(idx<diff.length){
            if(diff[idx]!=0){
                break;
            }
            else{
                idx++;
            }
        }
        for(int x=idx;x<diff.length;x++){
            System.out.println(diff[x]);
        }
    }
}