import java.util.*;

public class pattern17 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int star=1;
        // write ur code here
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n/2;j++){
                if(i==n/2+1){
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
            }
            for(int j=1;j<=star;j++){
                System.out.print("*\t");
            }
            System.out.println();
            if(i<=n/2){
                star++;
            }
            else{
                star--;
            }
        }
    }
}