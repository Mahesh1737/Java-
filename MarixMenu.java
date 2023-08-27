import java.io.*;
import java.util.*;

class Mul_mat {

    public static void main(String[] args) {

        int n, i, j, op = 1, m, p, q, k;

        Scanner sc = new Scanner(System.in);

        System.out.println(" \nEnter rows for matrix 1: ");
        m = sc.nextInt();

        System.out.println(" \n Enter cols for matrix 1: ");
        n = sc.nextInt();

        int[][] a = new int[m][n];

        // initialise array a with 0
        for (i = 0; i < m; i++)
            for (j = 0; j < n; j++)
                a[i][j] = 0;

        // accepting matrix from user
        System.out.println(" \n Enter  matrix 1 : ");
        for (i = 0; i < m; i++)
            for (j = 0; j < n; j++)
                a[i][j] = sc.nextInt();

        // display 2D array matrix
        System.out.println("1 Matrix is : \n");
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                System.out.print("   " + a[i][j] + "   ");
            }
            System.out.println(" ");
        }

        System.out.println("\n Enter rows for matrix 2: ");
        p = sc.nextInt();

        System.out.println(" \nEnter cols for matrix 2: ");
        q = sc.nextInt();

        int[][] b = new int[p][q];

        // initialise array b with 0

        for (i = 0; i < p; i++)
            for (j = 0; j < q; j++)
                b[i][j] = 0;

        // acceptin matrix from user
        System.out.println("\n Enter  matrix 2: ");
        for (i = 0; i < p; i++)
            for (j = 0; j < q; j++)
                b[i][j] = sc.nextInt();

        // display 2D array matrix
        System.out.println("\n  Matrix 2   is : \n ");
        for (i = 0; i < p; i++) {
            for (j = 0; j < q; j++) {
                System.out.print("    " + b[i][j] + "   ");
            }
            System.out.println("  ");
        }

        int[][] c = new int[m][q];
        System.out.println("  ___________");
        while (op > 0 && op <= 4) {
            System.out.println(" 1: add ");
            System.out.println(" 2: mul");
            System.out.println(" 3: transpose ");
            System.out.println(" 4:exit\n ");

            System.out.print(" Enter option: ");
            op = sc.nextInt();

            switch (op)

            {

                case 1:

                    System.out.println("  ___________");

                    if (m == p && n == q) {
                        System.out.println("  \nAdd is :\n ");
                        for (i = 0; i < m; i++) {
                            for (j = 0; j < n; j++) {
                                c[i][j] = a[i][j] + b[i][j];
                                // System.out.println(" Add is : \n");
                                System.out.print("   " + c[i][j] + "   ");
                            }
                            System.out.println("  ");
                        }
                    } else
                        System.out.println(" \nAdd not possible: ");

                    System.out.println("  ___________");
                    System.out.println("    \n ");
                    break;
                // System.out.println(" \n " );

                case 2:

                    System.out.println("  ___________");
                    if (n == p) {
                        // If the number of columns in matrix 'a' (n) is equal to the number of rows in
                        // matrix 'b' (p),
                        // we can perform matrix multiplication.

                        System.out.println("  \nmul is  is :\n ");
                        // Print a message indicating that matrix multiplication is being performed.

                        for (i = 0; i < m; i++) {
                            // Loop through each row of matrix 'a' (m rows).

                            for (j = 0; j < q; j++) {
                                // Loop through each column of matrix 'b' (q columns).

                                c[i][j] = 0;
                                // Initialize the value of the element in the result matrix 'c' at row i and
                                // column j to 0.

                                for (k = 0; k < n; k++) {
                                    // Loop through each element of the row in matrix 'a' and each element of the
                                    // column in matrix 'b'.

                                    c[i][j] += a[i][k] * b[k][j];
                                    // Perform the dot product of the corresponding row in 'a' and column in 'b',
                                    // and accumulate the result in the appropriate position of the result matrix
                                    // 'c'.
                                }

                                System.out.print("    " + c[i][j] + "   ");
                                // Print the calculated value of the current element in the result matrix 'c'.
                            }

                            System.out.println("  ");
                            // Move to the next line after finishing a row in the result matrix 'c'.
                        }
                    }

                    else
                        System.out.println(" \n Multiplication is  not possible:\n");
                    break;

                case 3:
                /*
                   11 |12| 13
                
                   |21|  22 23

                   31 32 33
                  
                   backwards the indix of those 
                 */

                    System.out.println("_____________________");
                    for (i=0;i<n;i++)
                    {
                        for (j=0;j<m;j++)
                        {
                            System.out.print("   "+ a[j][i] +"   ");
                        }
                        System.out.println("   ");
                    }
                    System.out.println("_____________________");
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
        }
    }
}