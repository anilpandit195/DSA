package GettingStarted;

// import java.util.*;
public class array {
    public static void main(String[] args) {
        int arr[] = new int[5];
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);

        arr[0] = 5;
        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 3;
        arr[4] = 4;

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);

        // for loop in array

        for (int indx = 0; indx <= arr.length - 1; indx++) {
            int val = arr[indx];
            System.out.print(val + "");
        }
        System.out.println();

        // for each loop in array

        for (int pepcoding : arr) {
            System.out.print(pepcoding + "");
        }
        System.out.println();

    }
}