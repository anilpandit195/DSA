import java.util.*;

public class AnybasetoAnybase {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b1 = scn.nextInt();
        int b2 = scn.nextInt();
        int d = getvalue(n, b1, b2);
        System.out.println(d);
        scn.close();

    }

    public static int getvalue(int n, int b1, int b2) {
        int dec = AnybasetoDecimal(n, b1);
        int dn = decimaltoanybase(dec, b2);
        return dn;
    }

    public static int decimaltoanybase(int n, int b) {
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

    public static int AnybasetoDecimal(int n, int b) {
        int rv = 0;
        int p = 1;
        while (n > 0) {
            int digit = n % 10;
            n = n / 10;
            rv += digit * p;
            p = p * b;
        }
        return rv;
    }
}
