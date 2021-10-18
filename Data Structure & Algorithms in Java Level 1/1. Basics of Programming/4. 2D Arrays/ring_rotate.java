import java.io.*;
import java.util.*;

public class ring_rotate {

    public static void main(String[] args) throws Exception {
        
        // write your code here
        Scanner scn=new Scanner(System.in);
        int m=scn.nextInt();
        int n=scn.nextInt();
        int[][] twodarr=new int[m][n];
        for(int i=0;i<twodarr.length;i++){
            for(int j=0;j<twodarr[0].length;j++){
                twodarr[i][j]=scn.nextInt();
            }
        }
        int s=scn.nextInt();
        int r=scn.nextInt();

        int[] onedarr=fillOnedArray(twodarr, s);
        
        rotate(onedarr, r);

        fillTwodArray(onedarr, twodarr, s);
        for(int i=0;i<twodarr.length;i++){
            for(int j=0;j<twodarr[0].length;j++){
                System.out.print(twodarr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static int[] fillOnedArray(int[][] twodarr, int s){  
        int rows= twodarr.length;
        int cols= twodarr[0].length;

        int rmin=s-1;
        int cmin=s-1;
        int rmax=rows-s;
        int cmax=cols-s;
        
        int size=2*(rmax+cmax)-2*(rmin+cmin);
        int[] onedarr=new int[size];
        
        int idx=0;

        //left wall [column at cmin, rows varies from rmin to rmax]
        for(int i=rmin, j=cmin; i<=rmax; i++){
            onedarr[idx]=twodarr[i][j];
            idx++;
        }
        cmin++;

        //bottom wall [row at rmax, cols varies from cmin to cmax]
        for(int i=rmax, j=cmin; j<=cmax; j++){
            onedarr[idx]=twodarr[i][j];
            idx++;
        }
        rmax--;

        //right wall [column at cmax, rows varies from rmax to rmin]
        for(int i=rmax, j=cmax; i>=rmin; i--){
            onedarr[idx]=twodarr[i][j];
            idx++;
        }
        cmax--;

        //top wall [row at rmin, cols varies from cmax to cmin]
        for(int i=rmin, j=cmax; j>=cmin; j--){
            onedarr[idx]=twodarr[i][j];
            idx++;
        }
        rmin++;

        return onedarr;
    }

    public static void rotate(int[] onedarr, int r) {
        r=r%onedarr.length;
        if(r<0){
            r=r+onedarr.length;
        }

        reverse(onedarr, 0, onedarr.length-1-r);
        reverse(onedarr, onedarr.length-r, onedarr.length-1);
        reverse(onedarr, 0, onedarr.length-1);
    }

    public static void reverse(int[] onedarr, int left, int right) {
        while(left<right){
            int temp=onedarr[left];
            onedarr[left]=onedarr[right];
            onedarr[right]=temp;

            left++;
            right--;
        }
    }

    public static void fillTwodArray(int[] onedarr, int[][] twodarr, int s) {
        int rows= twodarr.length;
        int cols= twodarr[0].length;

        int rmin=s-1;
        int cmin=s-1;
        int rmax=rows-s;
        int cmax=cols-s;
        
        int idx=0;

        //left wall [column at cmin, rows varies from rmin to rmax]
        for(int i=rmin, j=cmin; i<=rmax; i++){
            twodarr[i][j]=onedarr[idx];
            idx++;
        }
        cmin++;

        //bottom wall [row at rmax, cols varies from cmin to cmax]
        for(int i=rmax, j=cmin; j<=cmax; j++){
            twodarr[i][j]=onedarr[idx];
            idx++;
        }
        rmax--;

        //right wall [column at cmax, rows varies from rmax to rmin]
        for(int i=rmax, j=cmax; i>=rmin; i--){
            twodarr[i][j]=onedarr[idx];
            idx++;
        }
        cmax--;

        //top wall [row at rmin, cols varies from cmax to cmin]
        for(int i=rmin, j=cmax; j>=cmin; j--){
            twodarr[i][j]=onedarr[idx];
            idx++;
        }
        rmin++;
    }

}