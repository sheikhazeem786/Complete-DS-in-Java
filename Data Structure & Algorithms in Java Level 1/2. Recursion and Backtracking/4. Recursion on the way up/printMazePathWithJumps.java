import java.util.*;

public class printMazePathWithJumps {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int dr=scn.nextInt();
        int dc=scn.nextInt();
        pmpWithJumps(1,1,dr,dc,"");
    }
    public static void pmpWithJumps(int sr, int sc, int dr, int dc, String psf) {
        
        if(sr==dr&&sc==dc){
            System.out.println(psf);
            return;
        }
        for(int hss=1; hss<=dc-sc;hss++){
            pmpWithJumps(sr, sc+hss, dr, dc, psf+"h"+hss);
        }
        for(int vss=1; vss<=dr-sr;vss++){
            pmpWithJumps(sr+vss, sc, dr, dc, psf+"v"+vss);
        }
        for(int dss=1; dss<=dc-sc && dss<=dr-sr;dss++){
            pmpWithJumps(sr+dss, sc+dss, dr, dc, psf+"d"+dss);
        }
    }
}
