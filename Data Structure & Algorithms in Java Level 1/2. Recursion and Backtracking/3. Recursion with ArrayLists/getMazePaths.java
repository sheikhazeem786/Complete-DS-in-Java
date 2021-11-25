import java.io.*;
import java.util.*;

public class getMazePaths {

    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        int dr=scn.nextInt();
        int dc=scn.nextInt();
        ArrayList<String> result=getMazePaths(1, 1, dr, dc);
        System.out.println(result);
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if(sr>dr || sc>dc){
            ArrayList<String> bres=new ArrayList<>();
            return bres;
        }else if(sr==dr && sc==dc){
            ArrayList<String> bres=new ArrayList<>();
            bres.add("");
            return bres;
        }
        ArrayList<String> getPath=new ArrayList<>();
        ArrayList<String> getHPath=getMazePaths(sr, sc+1, dr, dc);
        ArrayList<String> getVPath=getMazePaths(sr+1, sc, dr, dc);
        for(String hpath: getHPath){
            getPath.add("h"+hpath);
        }
        for(String vpath: getVPath){
            getPath.add("v"+vpath);
        }

        return getPath;
    }

}