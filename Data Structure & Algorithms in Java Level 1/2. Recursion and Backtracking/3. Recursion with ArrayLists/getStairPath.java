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
        if(n<0){
            ArrayList<String> bsp= new ArrayList<>();
            return bsp;
        }else if(n==0){
            ArrayList<String> bsp= new ArrayList<>();
            bsp.add("");
            return bsp;
        }

        ArrayList<String> pathsfromnm1=getStairPaths(n-1);
        ArrayList<String> pathsfromnm2=getStairPaths(n-2);
        ArrayList<String> pathsfromnm3=getStairPaths(n-3);

        ArrayList<String> pathsfromn=new ArrayList<>();

        for(String pathfromnm1: pathsfromnm1){
            pathsfromn.add("1"+pathfromnm1);
        }
        for(String pathfromnm2: pathsfromnm2){
            pathsfromn.add("2"+pathfromnm2);
        }
        for(String pathfromnm3: pathsfromnm3){
            pathsfromn.add("3"+pathfromnm3);
        }


        return pathsfromn;
    }

}

// import java.io.*;
// import java.util.*;

// public class getStairPath {

//     public static void main(String[] args) throws Exception {

//         Scanner scn=new Scanner(System.in);
//         int n=scn.nextInt();
//         ArrayList<String> gsp=getStairPaths(n);
//         System.out.println(gsp);
//     }

//     public static ArrayList<String> getStairPaths(int n) {
        
//         if(n<0){
//             ArrayList<String> bsp=new ArrayList<>();
//             return bsp;
//         }else if(n==0){
//             ArrayList<String> bsp=new ArrayList<>();
//             bsp.add("");
//             return bsp;
//         }

//         ArrayList<String> gspfm1=getStairPaths(n-1);
//         ArrayList<String> gspfm2=getStairPaths(n-2);
//         ArrayList<String> gspfm3=getStairPaths(n-3);
//         ArrayList<String> gspfn=new ArrayList<>();

//         for(String getstairpath:gspfm1){
//             gspfn.add("1"+getstairpath);
//         }
//         for(String getstairpath:gspfm2){
//             gspfn.add("2"+getstairpath);
//         }
//         for(String getstairpath:gspfm3){
//             gspfn.add("3"+getstairpath);
//         }
//         return gspfn;
//     }

// }