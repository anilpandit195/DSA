import java.util.*;
public class patternForteen {
    public static void main(String[] arg){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for(int i=1; i<=10; i++){
            int ans = n*i;
            System.out.println(n + "*" + i + "=" + ans);       
        }
        scn.close();
    }
}
