import java.util.Scanner;

public class maxnumcount {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int num;
        int max = 0;
        int sum = 0;
        for (int i = 0; i < a; i++) {
            num = scn.nextInt();
            if (num > max) {
                sum = 1;
                max = num;
            } else if (num == max) {
                sum++;
            }

        }
        System.out.println(sum);
        scn.close();

    }
}
