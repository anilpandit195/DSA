package GettingStarted;

import java.util.*;

public class matrix {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] mat = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mat[i][j] = scn.nextInt();
            }
        }
        int k = 0;
        int l = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(mat[k][l]);
                if (l % 2 == 0) {
                    k++;
                } else
                    k--;

            }
            l++;
        }
        scn.close();
    }
}
