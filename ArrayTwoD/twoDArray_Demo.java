// import java.util.Scanner;
// public class twoDArray_Demo{
//     public static void main(String[] args){
//         Scanner scn = new Scanner(System.in);
//         int nr = scn.nextInt();
//         int nc = scn.nextInt();
//         int[][] mat = new int[nr][nc]; 
//         for(int r = 0; r < mat.length; r++){
//             for(int c = 0; c < mat[0].length; c++){
//                 mat[r][c] = scn.nextInt();
               
//             }
//         }
//         scn.close();
//         for(int r = 0; r < mat.length; r++){
//             for(int c = 0; c < mat[0].length; c++){
//                 System.out.print(mat[r][c]+" ");
//             }
//             System.out.println();
//         }
        
//     }
    
// }


import java.util.Scanner;
public class twoDArray_Demo{

    public static void input(int mat[][],Scanner scn){
        for(int r=0; r < mat.length; r++){
            for(int c=0; c < mat[0].length; c++){
                mat[r][c]=scn.nextInt();
            }
        }
    }

    public static void display(int mat[][]){
        for(int r = 0; r < mat.length; r++){
            for(int c = 0; c < mat[0].length; c++){
                System.out.print(mat[r][c]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int nr = scn.nextInt();
        int nc = scn.nextInt();
        int[][] mat = new int [nr][nc];

        input(mat,scn);
        display(mat);
    }

}