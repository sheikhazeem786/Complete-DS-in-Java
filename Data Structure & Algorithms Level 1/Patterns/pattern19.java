import java.util.*;
public class pattern19 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1||j==1||i==n/2+1||j==n/2+1||i==n||j==n){
                    
                    if((i>1&&i<=n/2&&j==1)||(j>n/2+1&&j<n&&i==1)||(i>n/2+1&&i<n&&j==n)||(j>1&&j<=n/2&&i==n)){
                        System.out.print("  ");
                    }else{
                         System.out.print("* ");
                    }
                   
   
   
                    
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
