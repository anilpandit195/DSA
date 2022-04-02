import java.util.*;
public class patternTwo{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for(int i=1; i<=n; i++){
            int star = (n+1)-i;
            for(int j=1; j<=star; j++){
                System.out.print("*\t");
            }
            System.out.println();
            scn.close();
        }
    }
}
