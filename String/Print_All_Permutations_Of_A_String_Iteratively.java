// 1. You are given a string. 2. You have to print all permutations of the given string iteratively.

// Constraints
// 1 <= length of string <= 15

// Format
// Input
// A String

// Output
// All permutations of the given string(one in a line).

// Example
// Sample Input

// abc

// Sample Output
// abc
// bac
// cab
// acb
// bca
// cba
import java.util.*;

public class Print_All_Permutations_Of_A_String_Iteratively {

    public static void solution(String str) {
        int n = str.length();
        int f = factorial(n);
        for (int i = 0; i < f; i++) {
            StringBuilder sb = new StringBuilder(str);
            int temp = i;
            for (int j = n; j >= 1; j--) {
                int q = temp / j;
                int r = temp % j;
                System.out.print(sb.charAt(r));
                sb.deleteCharAt(r);
                temp = q;

            }
            System.out.println();
        }

    }

    public static int factorial(int n) {
        int val = 1;
        for (int i = 2; i <= n; i++) {
            val *= i;

        }
        return val;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        solution(str);
        scn.close();
    }

}