import java.util.*;
public class theStateOfWakanda{
    
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int row = scn.nextInt();
        int column = scn.nextInt();
        int[][] matrix = new int[row][column];
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                matrix[i][j] = scn.nextInt();
            }
        }

        for(int col=0; col<column; col++){
            // even column
            if(col % 2 == 0){
                for(int ro=0; ro<row; ro++){
                    System.out.println(matrix[ro][col]);
                }
            }
             // odd column
            else{
                for(int ro = row-1; ro >= 0; ro--){
                    System.out.println(matrix[ro][col]);
                }
            }
        }
        scn.close();
    }
}
