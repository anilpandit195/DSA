import java.util.*;
public class PrintIncreasDecreas{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        printincreas(n);
        printdecreas(n);
    }

    public static void printincreas(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printincreas(n-1);
    }

    public static void printdecreas(int n){
        if(n==0){
            return;
        }
        printdecreas(n-1);
        System.out.println(n);
    }
}