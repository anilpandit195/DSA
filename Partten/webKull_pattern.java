import java.util.Scanner;

public class webKull_pattern  {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int attheret = n , space = n - 1 , stre = 1 , nspace = n - 2;
        int row = 1;
        for(int i=1; i<=attheret; i++){
                System.out.print("@");
            }
        System.out.println();
        while(row<=n){
            for(int i=1; i<=space; i++){
                System.out.print(" ");
            }
            for(int i=1; i<=stre; i++){
                System.out.print("*");
            }
            System.out.println();
            row++;
            if(row<=n/2+1){
                stre = stre + 1;
            }else{
                stre = stre - 1;
            }
        }
        for(int i=1; i<=nspace; i++){
            System.out.print(" ");
        }
        for(int i=1; i<=attheret; i++){
            System.out.print("@");
        }
        System.out.println();
        scn.close();
    }
}
