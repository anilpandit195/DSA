import java.util.*;
public class patternOne{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        for(int i=0; i<=n; i++){
            int str = i;
            for(int j=1; j<=str; j++){
                System.out.print("*\t");
            }
            System.out.println();
        }
        scn.close();
    }
}
