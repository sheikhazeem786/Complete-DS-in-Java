import java.util.*;
public class pattern16 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int space=2*n-3;
        int star=1;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=star;j++){
                System.out.print(j);
            }
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            if(i==n){
                star--;
            }
            for(int j=star;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
                star++;
                space-=2;
            
        }
    }
}
