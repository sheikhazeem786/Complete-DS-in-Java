import java.io.*;
import java.util.*;

public class spiral_display {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn=new Scanner(System.in);
        int m=scn.nextInt();
        int n=scn.nextInt();
        int[][] arr=new int[m][n];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=scn.nextInt();
            }
        }
        int minr=0;
        int minc=0;
        int maxr=arr.length-1;
        int maxc=arr[0].length-1;
        int count=1;
        int total=m*n;
        while(count<=total){
            //left wall, downwards
            for(int i=minr;i<=maxr && count<=total;i++){
                System.out.println(arr[i][minc]);
                count++;
            }
            minc++;
            //bottom wall, rightwards
            for(int j=minc;j<=maxc && count<=total;j++){
                System.out.println(arr[maxr][j]);
                count++;
            }
            maxr--;
            //right wall, upwards
            for(int i=maxr;i>=minr && count<=total;i--){
                System.out.println(arr[i][maxc]);
                count++;
            }
            maxc--;
            //left wall, downwards
            for(int j=maxc;j>=minc && count<=total;j--){
                System.out.println(arr[minr][j]);
                count++;
            }
            minr++;
        }
    }

}