// Constraints
// 1 <= length of string <= 1000

// Format
// Input
// A String

// Output
// A String

// Example
// Sample Input

// pepCODinG

// Sample Output
// PEPcodINg

import java.util.*;

public class ToggleOpticaDocument {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(toggleCase(str));
        scn.close();
    }

    public static String toggleCase(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                char upper = (char) (ch - 'a' + 'A');
                sb.append(upper);
            } else if (ch >= 'A' && ch <= 'Z') {
                char lower = (char) (ch - 'A' + 'a');
                sb.append(lower);
            }
        }
        return sb.toString();
    }

}