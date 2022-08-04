import java.util.*;
import java.io.*;
import java.math.*;
import java.text.*;
import java.util.regex.*;

public class minmaxsum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long sum = 0;
        long min = Long.MAX_VALUE;
        long max = Long.MIN_VALUE;
        for (int i = 0; i < 5; i++) {
            long arr = in.nextLong();
            sum += arr;
            max = Math.max(max, arr);
            min = Math.min(min, arr);

        }
        System.out.println((sum - max) + " " + (sum - min));
    }

}