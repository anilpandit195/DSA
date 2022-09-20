// Bad way to use static data

// import java.io.*;

// class OOPS_Encapsulation_staticData {
//     static class BankAccount {
//         int acc;
//         int money;
//         static int rio;

//         void anouns() {
//             System.out.println(this.acc + "[" + this.money + "]" + " " + this.rio);
//         }

//     }

//     public static void main(String[] args) throws NumberFormatException, IOException {
//         BankAccount b1 = new BankAccount();
//         b1.acc = 10;
//         b1.money = 1000;
//         b1.rio = 4;
//         b1.anouns();

//         BankAccount b2 = new BankAccount();
//         b2.acc = 20;
//         b2.money = 2000;
//         b2.rio = 5;
//         b2.anouns();
//         b1.anouns();

//     }
// }

// good way to use static data

import java.io.*;

class OOPS_Encapsulation_staticData {
    static class BankAccount {
        int acc;
        int money;
        static int rio;

        void anouns() {
            System.out.println(this.acc + "[" + this.money + "]" + " " + BankAccount.rio);
        }

    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        BankAccount b1 = new BankAccount();
        b1.acc = 10;
        b1.money = 1000;
        BankAccount.rio = 4;
        b1.anouns();

        BankAccount b2 = new BankAccount();
        b2.acc = 20;
        b2.money = 2000;
        BankAccount.rio = 5;
        b2.anouns();
        b1.anouns();

    }
}