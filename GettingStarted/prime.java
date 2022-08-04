package GettingStarted;
// import java.util.*;

// public class prime {
//   public static void main(String[] args) {
//     Scanner scn = new Scanner(System.in);
//     int num = scn.nextInt();
//     int flag=1;
//     scn.close();
//     for(int i=2; i<=(num-1); i++){
//         if(num%i==0){
//             flag=0;
//             break;
//         }
//     }
//     if(flag==1){
//         System.out.println("Prime");
//     }    
//         else{
//             System.out.println("Not Prime");
//         }

//   } 
// }

// FOR MULTIPLE USER INPUT

import java.util.*;

class prime {
    public static void main(String[] ags) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();

        for (int j = 1; j <= t; j++) {
            int num = scn.nextInt();

            int flag = 1;

            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    flag = 0;
                    break;
                }
            }
            if (flag == 1) {
                System.out.println("Prime");
            } else {
                System.out.println("Not Prime");
            }
        }
        scn.close();

    }
}