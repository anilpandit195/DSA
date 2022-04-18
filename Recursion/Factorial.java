import java.util.*;

public class Factorial {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int ans = facto(n);
        System.out.println(ans);
        scn.close();
    }

    public static int facto(int n) {
        if (n == 0) {
            return 1;
        }
        int factn = facto(n - 1);
        int fan = n * factn;
        return fan;
    }
}
