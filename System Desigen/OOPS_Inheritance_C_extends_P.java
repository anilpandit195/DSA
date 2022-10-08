import java.io.*;

class OOPS_Inheritance_C_extends_P {
    static class p {
        int a = 1;
        int b = 10;

        void fun() {
            System.out.println("p fun");
        }

        void fun1() {
            System.out.println("p fun1");
        }
    }

    static class c extends p {
        int a = 2;
        int b2 = 20;

        void fun() {
            System.out.println("c fun");
        }

        void fun2() {
            System.out.println("c fun2");
        }
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        p obj = new p();
        System.out.println(obj.a);
        System.out.println(obj.b);
        obj.fun();
        obj.fun1();
    }

}
