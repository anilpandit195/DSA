import java.io.*;

public class OOPS_Encapsulation {

    static class person {
        String name;
        int age;

        void SayHi() {
            System.out.println(name + "[" + age + "]" + " says Hi!");
        }
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        person p1 = new person();
        p1.age = 10;
        p1.name = "A";
        p1.SayHi();

        person p2 = new person();
        p2.age = 20;
        p2.name = "B";
        p2.SayHi();

        person p3 = p2;
        p2.name = "C";
        p3.SayHi();

        swipe(p1, p2);
        p1.SayHi();
        p2.SayHi();
    }

    static void swipe(person a, person b) {
        int temp = a.age;
        a.age = b.age;
        b.age = temp;

        String t = a.name;
        a.name = b.name;
        b.name = t;

    }

}
