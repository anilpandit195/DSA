import java.util.*;
public class patternNine{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int stre = n , space = 0 , row = 0;
        scn.close();
        while(row<n){
            for(int j=1; j<=space; j++){
                System.out.print("\t");
            }
            for(int k=1; k<=stre; k++){
                System.out.print("*\t");
            }
            System.out.println();
            stre = stre - 1;
            space = space + 1;
            row++;

        }
        
    }
}