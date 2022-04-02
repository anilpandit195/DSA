import java.util.*;
public class patternSix {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int space = 1;
        int stre = n/2+1  , row = 1;
        while(row<=n){
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
            if(row<=n/2){
                stre = stre-1;
                space = space+2;
            }else{
                stre = stre+1;
                space = space-2;
            }
            row++;
        }
        scn.close();
    }
}
