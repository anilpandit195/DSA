// 1. You are given an ArrayList of positive integers. 2. You have to remove prime numbers from the given ArrayList and return the updated ArrayList. Note -> The order of elements should remain same.

// Constraints
// 1 <= N <= 10000

// Format
// Input
// A number N arr1 arr2.. N numbers

// Output
// An Arraylist

// Example
// Sample Input

// 4
// 3 12 13 15

// Sample Output
// [12, 15]
import java.util.*;

public class Remove_Primes {

    public static boolean isPrime(int val) {
        for (int div = 2; div * div <= val; div++) {
            if (val % div == 0) {
                return false;
            }
        }
        return true;
    }

    public static void solution(ArrayList<Integer> al) {
        for (int i = al.size() - 1; i >= 0; i--) {
            int val = al.get(i);
            if (isPrime(val) == true) {
                al.remove(i);
            }
        }

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            al.add(scn.nextInt());
        }
        solution(al);
        System.out.println(al);
        scn.close();
    }

}