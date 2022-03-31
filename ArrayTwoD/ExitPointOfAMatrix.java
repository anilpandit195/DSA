import java.util.*;

public class ExitPointOfAMatrix {

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
       int dir = 0;
       int i = 0;
       int j = 0;
       while(true){
           dir = (dir+arr[i][j])%4;
           if(dir==0){//east diraction
            j++;
           }
           if(dir==1){//south diraction
           i++;
           }
           if(dir==2){//west direction
           j--;
           }
           if(dir==3){//north direction
           i--;
           }

           if(i<0){
               i++;
               break;
           }else if(j<0){
               j++;
               break;
           }else if(i == arr.length){
               i--;
               break;
           }else if(j == arr[0].length){
               j--;
               break;
           }
       }
       System.out.println(i);
       System.out.println(j);
       scn.close();
    }

}
