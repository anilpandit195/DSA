
import java.util.*;

public class decimal_to_anybase {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int dn = getValueInBase(n, b);
        System.out.println(dn);

        scn.close();
    }

    public static int getValueInBase(int n, int b) {
        // write code here
        int rv = 0;
        int p = 1;
        while (n > 0) {
            int digt = n % b;
            n = n / b;
            rv += digt * p;
            p = p * 10;

        }
        return rv;
    }
}
