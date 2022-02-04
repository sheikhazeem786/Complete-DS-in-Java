import java.io.*;
import java.util.*;

public class KnightsTour {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int[][] arr = new int[n][n];
        int r = scn.nextInt();
        int c = scn.nextInt();
        printKnightsTour(arr, r, c, 1);
        
    }

    public static void printKnightsTour(int[][] chess, int r, int c, int upcomingMove) {
        
        if(r<0 || c<0 || r>=chess.length || c>=chess.length || chess[r][c]!=0){ // subtle baat 3 -> Order is important 
            return;
        }else if(upcomingMove==chess.length * chess.length){
            chess[r][c]=upcomingMove; // subtle baat 1 -> You will see 1 to 24, and 0 in 25th 
            displayBoard(chess);
            chess[r][c]=0; // subtle baat 2 -> You will get just one answer
        }
        // subtle baat 4 -> Calls should be in clockwise
        chess[r][c] = upcomingMove;
        printKnightsTour(chess, r - 2, c + 1, upcomingMove + 1); // ttr
        printKnightsTour(chess, r - 1, c + 2, upcomingMove + 1); // trr
        printKnightsTour(chess, r + 1, c + 2, upcomingMove + 1); // drr
        printKnightsTour(chess, r + 2, c + 1, upcomingMove + 1); // ddr
        printKnightsTour(chess, r + 2, c - 1, upcomingMove + 1); // ddl
        printKnightsTour(chess, r + 1, c - 2, upcomingMove + 1); // dll
        printKnightsTour(chess, r - 1, c - 2, upcomingMove + 1); // tll
        printKnightsTour(chess, r - 2, c - 1, upcomingMove + 1); // ttl
        chess[r][c] = 0;
    }

    public static void displayBoard(int[][] chess){
        for(int i = 0; i < chess.length; i++){
            for(int j = 0; j < chess[0].length; j++){
                System.out.print(chess[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
    }
}