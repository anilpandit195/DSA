import java.util.*;
public class patternThree {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int space = n;
        int str = 1;
        for(int i=1; i<=n; i++){
            space--;
            
            for(int j=1; j<=space; j++){
                System.out.print("\t");
            }
            for(int j=1; j<=str; j++){
                System.out.print("*\t");
            }
            str++;
            System.out.println();
            scn.close();
        }

    }
}
