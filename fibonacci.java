import java.util.*;
class fibonacci{
    public static void main (String[]arg){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int first = 0 , second = 1;
        int i=1;
        // for( ; i<=n; i++)  using for loop
        while( i<=n){         //using while loop
            int thard = first+second;
            System.out.println(first);

            first=second;
            second=thard;
            i++;
            scn.close();

        }

    }
}
