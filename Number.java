import java.io.*;
import java.util.*;

class MyNumber {

    private int x;

    MyNumber() {
        x = 0;


    }

    MyNumber(int x) {

        this.x = x;

    }

    int isNegative() {
        if (x < 0)

            return 1;
        else
            return 0;

    }

    int isPositive() {

        if (x > 0)

            return 1;

        else
            return 0;

    }

    int isZero() {
        if (x == 0)
            return 1;
        else
            return 0;

    }

    int isOdd() {

        if (x % 2 == 1)

            return 1;

        else
            return 0;

    }

    int isEven() {

        if (x % 2 == 0)

            return 1;

        else
            return 0;

    }

    public static void main(String[] args) {
        int x; // -Integer.parseInt(args[0]);
        Scanner sc = new Scanner(System.in);
        System.out.print(" \nEnter number : ");
        x = sc.nextInt();

        MyNumber m = new MyNumber(x);

        int k1 = m.isNegative();
        if (k1 == 1)
            System.out.println(x + "   is Negative");

        int k2 = m.isPositive();
        if (k2 == 1)
            System.out.println(x + "  is Positive");

        int k3 = m.isEven();
        if (k3 == 1)
            System.out.println(x + "  is Even");

        int k4 = m.isOdd();
        if (k4 == 1)
            System.out.println(x + "  is Odd");

        int k5 = m.isZero();
        if (k5 == 1)
            System.out.println(x + "  is Zero");

    }

}
