import java.util.*;

public class PowerLinear {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();
        int ans = power(x, n);
        System.out.println(ans);
        scn.close();
    }

    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int ansn = power(x, n - 1);
        int ansx = x * ansn;
        return ansx;
    }
}
