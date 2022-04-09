import java.util.*;
public class patternSixteen {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int row = 0 , stre = 1 , space = n-2;
        scn.close();
        while(row<n){
            for(int i=1; i<=stre; i++){
                System.out.print("*\t");
            }
            for(int j=1; j<=space; j++){
                System.out.print("\t");
            }
            for(int i=1; i<=stre; i++){
                System.out.print("*\t");
            }
            System.out.println();
            row++;
            stre = stre + 1;
            space = space -2;


        }
    }
}
