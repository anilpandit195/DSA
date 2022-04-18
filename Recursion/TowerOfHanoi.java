import java.util.*;

public class TowerOfHanoi {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int src = scn.nextInt();
        int dest = scn.nextInt();
        int helper = scn.nextInt();

        tower(n, src, dest, helper);
        scn.close();
    }

    public static void tower(int n, int src, int dest, int helper) {
        if (n == 0) {
            return;
        }
        tower(n - 1, src, helper, dest);
        System.out.println(n + "[" + src + " -> " + dest + "]");
        tower(n - 1, helper, dest, src);
    }
}
