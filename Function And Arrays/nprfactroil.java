// import java.util.*;

// public class nprfactroil {
//     public static void main(String[] args) {
//         Scanner scn = new Scanner(System.in);
//         int n = scn.nextInt();
//         int r = scn.nextInt();

//         int nfact = 1;
//         for (int i = 1; i <= n; i++) {
//             nfact *= i;
//         }

//         int nmfact = 1;
//         for (int i = 1; i <= n - r; i++) {
//             nmfact *= i;
//         }

//         int npm = nfact / nmfact;
//         System.out.println(n + "p" + r + " = " + npm);
//     }
// }

import java.util.*;

public class nprfactroil {

    public static int fact(int x) {
        int rv = 1;
        for (int i = 1; i <= x; i++) {
            rv = rv * i;
        }
        return rv;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int r = scn.nextInt();

        int nfact = fact(n);
        int nmfact = fact(n - r);

        int npr = nfact / nmfact;
        System.out.println(n + "p" + r + " = " + npr);
        scn.close();
    }
}