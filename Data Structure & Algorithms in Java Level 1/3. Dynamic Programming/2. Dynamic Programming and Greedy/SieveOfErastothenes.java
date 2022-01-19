import java.util.*;

public class SieveOfErastothenes {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        boolean[] arr=new boolean[n+1];

        for(int i=2;i*i<arr.length;i++){
            if(arr[i]==false){
                for(int div=i; i*div < arr.length; div++){
                    arr[i*div]=true;
                }
            }
        }

        for(int i=2;i<arr.length;i++){
            if(arr[i]==false){
                System.out.println(i);
            }
        }

    }    
}
