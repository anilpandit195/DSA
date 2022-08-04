import java.io.*;
import java.util.*;

public class javaEndOfFill {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int i = 0;
        while (scn.hasNextLine()) {
            System.out.println(++i + " " + scn.nextLine());
        }
        scn.close();
    }
}
