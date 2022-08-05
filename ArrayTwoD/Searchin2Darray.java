import java.util.*;

public class Searchin2Darray {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] mat = new int[n][n];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                mat[i][j] = scn.nextInt();
            }
        }
        int x = scn.nextInt();
        int row = 0, coll = mat[0].length - 1;
        while (row < mat.length && coll >= 0) {
            if (mat[row][coll] < x) {
                row++;
            } else if (mat[row][coll] > x) {
                coll--;
            } else if (mat[row][coll] == x) {
                System.out.println(row);
                System.out.println(coll);
                return;
            }
        }
        System.out.println("Not Found");
        scn.close();

    }

}