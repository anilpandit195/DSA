import java.util.*;
public class patternSeven {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int stre = 1; 
        int space = 0 , row = 0;
        scn.close();
        while(row<n){
            for(int i=1; i<=space; i++){
               System.out.print("\t");
            }
            for(int j=1; j<=stre; j++){
                System.out.print("*\t");       
            }
            System.out.println();
            space = space+1;
            row++;
        }
        
    }
}
