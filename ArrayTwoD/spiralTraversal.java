import java.util.*;

public class spiralTraversal {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int row = scn.nextInt();
        int col = scn.nextInt();
        int[][] arr = new int[row][col];
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                arr[i][j] = scn.nextInt(); 
            }
        }

        int minR = 0;
        int minC = 0;
        int maxR = arr.length-1;
        int maxC = arr[0].length-1;
        int tne = row*col;
        int count = 0;

        while(count < tne){
            // left wall
            for(int i=minR , j=minC; i<=maxR && count < tne; i++){
                System.out.println(arr[i][j]);
                count++;
            }
            minC++;
            // bottom wall
            for(int i=maxR , j=minC; j<=maxC && count < tne; j++){
                System.out.println(arr[i][j]);
                count++;
            }
            maxR--;
            // right wall
            for(int i=maxR , j=maxC; i>=minR && count < tne; i--){
                System.out.println(arr[i][j]);
                count++;
            }
            maxC--;
            // top wall
            for(int i=minR , j=maxC; j>=minC && count < tne; j--){
                System.out.println(arr[i][j]);
                count++;
            }
            minR++;

        }
        scn.close();
    }

}
