import java.util.*;

public class incomtaxcalc {
    static void calculateTax(String array, long income) {
        if (income >= 300000) {
            float x = (float) (20 / 100f) * income;
            long tax = (long) x;
            System.out.println(array + " : Rs " + tax);
        } else if (income >= 100000 && income < 300000) {
            float x = (float) (10 / 100f) * income;
            long tax = (long) x;
            System.out.println(array + " : Rs " + tax);
        } else if (income < 100000 && income >= 0) {
            System.out.println(array + " : Rs 0");
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int person;
        System.out.println("Tax Calculator App \n ----- WELCOME ------ ");
        System.out.println("Enter total person count:");
        person = Integer.parseInt(scn.nextLine());
        String[] array = new String[person];
        long income[] = new long[person];
        int j = 1;
        for (int i = 0; i < array.length; i++) {
            System.out.printf("Enter name %d:", j++);
            array[i] = scn.nextLine();
            System.out.printf("Enter %s's Annual Income: ", array[i]);
            income[i] = scn.nextLong();
            scn.nextLine();
        }
        System.out.println(" ");
        System.out.println("Names with liable taxes\n" +
                "               ");
        for (int i = 0; i <= array.length; i++) {
            calculateTax(array[i], income[i]);
        }
        scn.close();

    }

}
