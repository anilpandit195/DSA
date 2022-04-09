import java.util.Scanner;

public class  Linear_chack {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        
        for(int i=0; i<n; i++){
            x[i] = scn.nextInt();
            y[i] = scn.nextInt();
        }
        scn.close();
        int chack1 = 1;
        for(int i=1; i<n; i++){
            if(x[i] != x[i-1]){
                chack1 = 0;
                break;
            }
        }
        if(chack1==1){
            System.out.println("YES");
            return;
        }
        
        int chack2 = 1;
        for(int i=1; i<n; i++){
            if(y[i] != y[i-1]){
                chack2 = 0;
                break;
            }
        }
        if(chack2==1){
            System.out.println("YES");
            return;
        }
        
        System.out.println("NO");
    }
}
