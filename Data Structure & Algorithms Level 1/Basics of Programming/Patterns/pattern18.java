import java.util.*;

public class pattern18{

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int star=n;
        int space=0;
        // write ur code here
        for(int i=1;i<=n;i++){
            for(int j=1;j<=space;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=star;j++){
                if(i>1&&i<=n/2){
                    if(j==1||j==star){
                        System.out.print("* ");
                    }
                    else{
                        System.out.print("  ");
                    }
                }
                else{
                    System.out.print("* ");
                }
            }
            System.out.println();
            if(i<=n/2){
                star-=2;
                space++;
            }
            else{
                star+=2;
                space--;
            }
        }
    }
}    