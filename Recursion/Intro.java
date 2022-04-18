import java.util.*;
public class Intro{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        recursion(n);
    }


    public static void recursion(int n){
        if(n==0){
            return;
        }
        recursion(n-1);
        System.out.println(n);
    }
}