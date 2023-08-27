import java.util.Scanner;
import java.lang.Math.*;

class Operations {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        {
            int opt = 1, r, h, vol, num;
            float PI = 3.14f;
            while (opt >= 1 && opt <= 4) {
                System.out.println("\n 1. Volume of Cylinder : ");
                System.out.println("\n 2. Factorial of Number : ");
                System.out.println("\n 3. Armstrong Number : ");
                System.out.println("\n 4. Exit : ");
                opt = sc.nextInt();

                switch (opt) {
                    case 1:
                        System.out.println("Enter the Radius : ");
                        r = sc.nextInt();
                        System.out.println("Enter the Height : ");
                        h = sc.nextInt();
                        vol = (int) (PI * (r * r) * h);
                        System.out.println("Volume of cylinder : " + vol);
                        break;
                    case 2:
                        System.out.println("Enter the number : ");
                        num = sc.nextInt();
                        int fact = 1, i = 1;
                        for (i = 1; i <= num; i++) {
                            fact = fact * i;
                        }
                        System.out.println("Factorial of\t" + num + "\tis\t" + fact);
                        break;
                    case 3:
                        int num1, digit, sum = 0;
                        System.out.println("Enter the Number : ");
                        num = sc.nextInt();
                        num1 = num;

                        while (num1 > 0) {
                            digit = num1 % 10;
                            sum += (digit * digit * digit);
                            num1 /= 10;
                        }
                        if (sum == num)
                            System.out.println("Number is armstrong");
                        else
                            System.out.println("Number is  not armstrong");
                        break;
                    case 4:
                        System.exit(0);
                        break;

                }
            }
        }
    }
}
