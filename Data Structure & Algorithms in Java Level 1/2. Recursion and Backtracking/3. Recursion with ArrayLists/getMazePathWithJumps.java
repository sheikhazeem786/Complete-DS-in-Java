import java.util.*;

public class getMazePathWithJumps {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int dr=scn.nextInt();    
        int dc=scn.nextInt();    
        ArrayList<String> res= gmpWithJump(1,1,dr,dc);
        System.out.println(res);   
    }

    public static ArrayList<String> gmpWithJump(int sr, int sc, int dr, int dc) {
    
        if(sr>dr || sc>dc){
            ArrayList<String> bres=new ArrayList<>();
            return bres;
        }
        else if(sr==dr&&sc==dc){
            ArrayList<String> bres=new ArrayList<>();
            bres.add("");
            return bres;
        }
        ArrayList<String> mres=new ArrayList<>();

        for(int hss=1;hss<=dc-sc;hss++){
            ArrayList<String> hpaths=gmpWithJump(sr, sc+hss, dr, dc);
            for(String path:hpaths){
                mres.add("h"+hss+path);
            }
        }
        for(int vss=1;vss<=dr-sr;vss++){
            ArrayList<String> vpaths=gmpWithJump(sr+vss, sc, dr, dc);
            for(String path:vpaths){
                mres.add("v"+vss+path);
            }
        }
        for(int dss=1; dss <= dc-sc && dss <= dr-sr;dss++){
            ArrayList<String> dpaths=gmpWithJump(sr+dss, sc+dss, dr, dc);
            for(String path:dpaths){
                mres.add("d"+dss+path);
            }
        }        
        
        return mres;
    }
}
