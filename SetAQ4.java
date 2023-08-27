import java.io.*;
import java.util.*;

class person
{
      public static void main(String args[])
      {
             String first_name, last_name, middle_name;
             Scanner sc = new Scanner(System.in);
             
             System.out.print("Enter First Name of Person: ");
             first_name = sc.next();
             
             System.out.print("Enter Middle Name of Person: ");
             middle_name = sc.next();
             
             System.out.print("Enter last Name of Person: ");
             last_name = sc.next();
             
             int len = middle_name.length();
             String f_l = middle_name.substring(0,1);
             String l_s = middle_name.substring(1,len);
             (f_l) = f_l.toUpperCase();
             middle_name = f_l + l_s;
             
            System.out.print("\nUpdated String : \n");
            System.out.println("Last Name of Person : "+last_name);
            System.out.println("first Name of Person :"+first_name);
            System.out.println("Middle Name of Person :"+middle_name);
      }
}

/*
Output :

ty28@pc61:~/TY28/JAVA/ASSIGNMENT_02/Set_A$ javac SetAQ3.java
ty28@pc61:~/TY28/JAVA/ASSIGNMENT_02/Set_A$ java person
Enter First Name of Person: mahesh
Enter Middle Name of Person: ranu
Enter last Name of Person: more

Updated String : 
Last Name of Person : more
first Name of Person :mahesh
Middle Name of Person :Ranu


*/
