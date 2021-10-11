import java.io.*;
import java.util.*;

public class arrays_demo {

public static void main(String[] args) throws Exception{
    Scanner scn=new Scanner(System.in);
    int n1=scn.nextInt();
    int n2=scn.nextInt();
    int arr[][]=new int[n1][n2];
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[0].length;j++){
            arr[i][j]=scn.nextInt();
        }
    }
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[0].length;j++){
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
    }
}
}