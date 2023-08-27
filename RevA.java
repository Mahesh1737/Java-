// import java.io.*;
import java.util.Scanner;

class Reverse
{
   public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of the array : ");
        n = sc.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println(" Enter the " + i + " array element : ");
            a[i] = sc.nextInt();
        }
        System.out.print("\n");
        System.out.println("\nArray elements Are : ");

        for (int i = 0; i < n; i++) {
            System.out.println(" " + a[i] + " ");
        }
        System.out.println("\nReverse Array elements Are : ");

        for (int i = n - 1; i >= 0; i--) {
            System.out.println(" " + a[i]+" ");
        }

    }
}