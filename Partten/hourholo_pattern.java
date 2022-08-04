import java.util.Scanner;

public class hourholo_pattern {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int space = 0;
        int stre = n, row = 1;
        scn.close();
        while (row <= n) {
            for (int i = 1; i <= space; i++) {
                System.out.print("\t");
            }
            for (int i = 1; i <= stre; i++) {
                if (row > 1 && row < n / 2 + 1 && i > 1 && i < stre) {
                    System.out.print("\t");
                } else {
                    System.out.print("*\t");
                }

            }
            System.out.println();
            row++;
            if (row <= n / 2 + 1) {
                space = space + 1;
                stre = stre - 2;

            } else {
                space = space - 1;
                stre = stre + 2;
            }
        }
    }

}