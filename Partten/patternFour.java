import java.util.*;
public class patternFour {
    public static void main(String[] arg){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int stre = n;
        int space = 0;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=space; j++){
                System.out.print("\t");
            }
            for(int j=1; j<=stre; j++){
                System.out.print("*\t");
            }
            System.out.println();
            space++;
            stre--;

        }
        scn.close();
    }
}
