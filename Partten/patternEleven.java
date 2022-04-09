import java.util.*;
public class patternEleven {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int stre = 1 , row = 0 , count = 1;
        while(row<n){

            for(int i=1; i<=stre; i++){
                System.out.print(count+"\t");
                count++;
            }
            System.out.println();
            stre = stre + 1;
            row++;
            scn.close();
        }

    }
}
