import java.util.*;
public class patternTen {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int space = n/2 , stre = 1 , row = 1;
        while(row<=n){
            for(int i=1; i<=space; i++){
                System.out.print("\t");
            }
            for(int j=1; j<=stre; j++){
                if(j==1 || j==stre){
                 System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
            }
            System.out.println();
            
            if(row<=n/2){
                space = space - 1;
                stre = stre + 2;

            }
            else{
                space = space + 1;
                stre = stre - 2;
            }
            scn.close();
            row++;
        }
    }
}
