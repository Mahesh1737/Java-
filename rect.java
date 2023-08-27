// import java.io.*;
import java.util.Scanner;

class rect
{
    public static void main(String[] args)
    {
        int i, peri, area, l, b ;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the length : ");
        l = sc.nextInt();
        System.out.println("Enter the breadth : ");
        b = sc.nextInt();
        area = l*b;
        peri = 2*(l+b);
        System.out.println("Area Of rectangle : "+area);
        System.out.println("Perimeter of the rectangle : "+peri);
    }
}