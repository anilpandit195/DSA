import java.util.*;

public class plusMinus{
    
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        plusMinuss(arr);
        scn.close();
    } 
    public static void plusMinuss(int[] arr) {
        float pos = 0 , nag = 0 , zero = 0;
        int n = arr.length;
        for(int i = 0; i < n; i++){
            if(arr[i] > 0){
                pos++;
            }else if(arr[i] < 0){
                nag++;
            }else if(arr[i] == 0){ 
                zero++;
            }
            
        }
        System.out.printf("%.6f\n",pos/n);
        System.out.printf("%.6f\n",nag/n);
        System.out.printf("%.6f\n",zero/n);

    }

}