import java.util.*;

public class printMazePath {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int dr=scn.nextInt();    
        int dc=scn.nextInt();
        printMazePaths(1,1,dr,dc,"");
    }

    public static void printMazePaths(int sr, int sc, int dr, int dc, String path) {

        if(sr>dr || sc>dc){
            return;
        }else if(sr==dr && sc==dc){
            System.out.println(path);
            return;
        }
        printMazePaths(sr, sc+1, dr, dc, path+"h");
        printMazePaths(sr+1, sc, dr, dc, path+"v");
    }
}
