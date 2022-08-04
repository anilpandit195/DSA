import java.util.*;

public class ArraySum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int sum = 0;

        for (int i = 0; i < a; i++) {
            sum += scn.nextInt();

        }
        System.out.println(sum);

        scn.close();

    }
}
