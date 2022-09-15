import java.io.*;

public class OOPS_Encapsulation_heapReferance {

    static class point {
        int x;
        int y;
    }

    static class rectangle {
        point tl;
        point br;
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        rectangle r1 = new rectangle();
        r1.tl = new point();
        r1.tl.x = 10;
        r1.tl.y = 20;

        r1.br = new point();
        r1.br.x = 30;
        r1.br.y = 40;

    }

}
