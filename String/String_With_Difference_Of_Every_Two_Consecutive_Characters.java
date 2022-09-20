// 1. You are given a string that contains only lowercase and uppercase alphabets. 
// 2. You have to form a string that contains the difference of ASCII values of every two consecutive characters between those characters.
//    For "abecd", the answer should be "a1b3e-2c1d", as 
//    'b'-'a' = 1
//    'e'-'b' = 3
//    'c'-'e' = -2
//    'd'-'c' = 1

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
// p-11e11p-45C12O-11D37i5n-39G

import java.util.*;

public class String_With_Difference_Of_Every_Two_Consecutive_Characters {

    public static String solution(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str.charAt(0));

        for (int i = 1; i < str.length(); i++) {
            char currnt = str.charAt(i);
            char privous = str.charAt(i - 1);
            int gap = currnt - privous;
            sb.append(gap);
            sb.append(currnt);

        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(solution(str));
        scn.close();
    }

}