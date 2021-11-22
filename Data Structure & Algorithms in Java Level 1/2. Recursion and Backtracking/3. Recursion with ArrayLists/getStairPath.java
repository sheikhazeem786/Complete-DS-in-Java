import java.io.*;
import java.util.*;

public class getStairPath {

    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        ArrayList<String> paths= getStairPaths(n);
        System.out.println(paths);
    }

    public static ArrayList<String> getStairPaths(int n) {
        if(n==0){
            ArrayList<String> bres= new ArrayList<>();
            bres.add("");
            return bres;
        }else if(n<0){
            ArrayList<String> bres= new ArrayList<>();
            return bres;
        }

        ArrayList<String> pathsfromnm1=getStairPaths(n-1);
        ArrayList<String> pathsfromnm2=getStairPaths(n-2);
        ArrayList<String> pathsfromnm3=getStairPaths(n-3);

        ArrayList<String> pathsfromn=new ArrayList<>();

        for(String pathfromnm1: pathsfromnm1){
            String pathfromn="1"+pathfromnm1;
            pathsfromn.add(pathfromn);
        }
        for(String pathfromnm1: pathsfromnm2){
            String pathfromn="2"+pathfromnm1;
            pathsfromn.add(pathfromn);
        }
        for(String pathfromnm1: pathsfromnm3){
            String pathfromn="3"+pathfromnm1;
            pathsfromn.add(pathfromn);
        }


        return pathsfromn;
    }

}