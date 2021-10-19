//least in a row, Max in a column;

import java.io.*;
import java.util.*;

public class saddle_point {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        for (int i = 0; i < arr.length; i++) {
            int min = arr[i][0];
            int psaddle = 0;
            for (int j = 1; j < arr[0].length; j++) {
                if (arr[i][j] < min) {
                    min = arr[i][j];
                    psaddle = j;
                }
            }

            boolean isSaddle = true;
            for (int ii = 0; ii < arr.length; ii++) {
                if (arr[ii][psaddle] > min) {
                    isSaddle = false;
                    break;
                }
            }

            if (isSaddle == true) {
                System.out.println(min);
                return;
            }
        }
        System.out.println("Invalid input");
    }

}
