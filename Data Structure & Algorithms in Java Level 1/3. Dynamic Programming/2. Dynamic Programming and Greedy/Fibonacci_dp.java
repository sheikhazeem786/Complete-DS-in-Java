import java.io.*;
import java.util.*;

public class Fibonacci_dp{

    public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn= new Scanner(System.in);
    int n=scn.nextInt();
    int result=fib(n);
    System.out.println(result);
    }

    public static int fib(int n){
    if(n==0|| n==1){
        return n;
    }
    int fibnm1=fib(n-1);
    int fibnm2=fib(n-2);
    int fibn=fibnm1+fibnm2;
    return fibn;
    }
}