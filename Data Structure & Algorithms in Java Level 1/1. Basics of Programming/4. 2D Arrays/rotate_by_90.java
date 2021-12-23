import java.util.*;
import java.io.*;

public class rotate_by_90 {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[][] arr=new int[n][n];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=scn.nextInt();
            }
        }

        //transpose
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr[0].length;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }

        //reverse column for clockwise
        for(int i=0;i<arr.length;i++){
            int left=0;
            int right=arr[i].length-1;
            while(left<right){
                int temp=arr[i][left];
                arr[i][left]=arr[i][right];
                arr[i][right]=temp;

                left++;
                right--;
            }
        }
        // //reverse column for anti-clockwise
        // for(int i=0;i<arr.length;i++){
        //     int left=0;
        //     int right=arr[i].length-1;
        //     while(left<right){
        //         int temp=arr[left][i];
        //         arr[left][i]=arr[right][i];
        //         arr[right][i]=temp;

        //         left++;
        //         right--;
        //     }
        // }

        //print
        display(arr);

    }

    public static void display(int[][] arr) {
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
