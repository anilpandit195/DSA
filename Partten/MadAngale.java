

import java.util.Scanner;

public class MadAngale {	
	public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int stre1 = n;
        int space1 = 2;
        int stre2 = 2*n-1;
        int space2 = 2;
        int stre3 = 1;
        int row = 1;
        while(row<=n){
                printStars(stre1);
            
                printSpaces(space1);
          
                printStars(stre2);
          
          
                printSpaces(space2);
          
         
                printStars(stre3);
          
         
                printSpaces(space2);
          
         
                printStars(stre2);
        
                printSpaces(space1);
          
                printStars(stre1);
          
            row++;
            space1 = space1 + 1;
            stre2 = stre2 - 2;
            stre3 = stre3 +2;
            System.out.println();
        }
        scn.close();
   
    
    }

    public static void printStars(int n){
        for(int i = 1 ; i <= n ;i++){
            System.out.print("*");
        }
    }

    public static void printSpaces(int n){
        for(int i = 1 ; i <= n ;i++){
            System.out.print(" ");
        }
    }
    
}