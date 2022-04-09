import java.util.*;
public class patternTwelve {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int stre = 1 , row = 0;
        while(row<n){
            int count = 0;
            
            for(int i=1; i<=stre; i++){
                if(count==0 || count==1){
                    System.out.print(count+"\t");
                }else{
                    int inc = count+1;
                    int ouc = inc;
                    System.out.print(ouc+"\t");
                }
            }
            System.out.println();
            count++;
            stre = stre + 1;
            row++;
            scn.close();
        }
    }
}
