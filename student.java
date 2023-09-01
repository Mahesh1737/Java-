import sy.*;
import ty.*;
import java.io.*;
import java.util.*;

class student
{
      int rno;
      String name;
      
      student(int rno, String name)
      {
             this.rno = rno;
             this.name = name;
      }
      public static void main(String args[])
       {
             Scanner sc = new Scanner(System.in);
             System.out.print("Enter the Number of Student : ");
             int n = sc.nextInt();
             student s[] = new student[n];    
             Symarks sy[] = new Symarks[n];  
             Tymarks ty[] = new Tymarks[n];  
             for (int i=0;i<n;i++)   
             {
                 System.out.print("\nEnter the roll no of the student : ");
                 int r = sc.nextInt();
                 
                 System.out.print("\nEnter the Name of Student : ");
                 String name = sc.next();
                 
                 System.out.print("Enter the marks of sy computer total out of 200 : ");
                 int c = sc.nextInt();
                 
                 System.out.print("Enter the marks of sy math total out of 200 : ");
                 int m = sc.nextInt();

                 System.out.print("Enter the marks of sy Electronics total out of 200 : ");
                 int e = sc.nextInt();

                 System.out.print("Enter the marks of ty Theory total out of 200 : ");
                 int th = sc.nextInt();

                 System.out.print("Enter the marks of ty Practical total out of 200 : ");
                 int pr = sc.nextInt();


                 //System.out.print("Enter the percentage of Student : ");
                 //float p = sc.nextFloat();
                 
                 s[i] = new student(r, name);
                 sy[i] = new Symarks(c, m, e);
                 ty[i] = new Tymarks(th, pr);
                 
                 //st[i].sytm = sy[i].ct+sy[i].mt+sy[i].et;
                // st[i].tytm = sy[i].ct+sy[i].mt+sy[i].et;
                 
                 
             }
             System.out.println("\n Roll no\tName\tcomTotal\tmathTotal\tElcTotal\tTheory\t\t prc: ");
             for (int i=0;i<n;i++)
             System.out.println( s[i].rno+"\t\t"+s[i].name+"\t"+sy[i].ct+"\t\t"+sy[i].mt+"\t\t"+sy[i].et+"\t\t"+ty[i].tm+"\t\t"+ty[i].pm); 
            
       }
}



/*

oUTPUT : 

ty28@pc61:~/TY28/JAVA/ASSIGNMENT_02/Set_B$ javac student.java
ty28@pc61:~/TY28/JAVA/ASSIGNMENT_02/Set_B$ java student
Enter the Number of Student : 2

Enter the roll no of the student : 28

Enter the Name of Student : M
Enter the marks of sy computer total out of 200 : 200
Enter the marks of sy math total out of 200 : 100
Enter the marks of sy Electronics total out of 200 : 150
Enter the marks of ty Theory total out of 200 : 128
Enter the marks of ty Practical total out of 200 : 160

Enter the roll no of the student : 30

Enter the Name of Student : A
Enter the marks of sy computer total out of 200 : 200
Enter the marks of sy math total out of 200 : 100
Enter the marks of sy Electronics total out of 200 : 150
Enter the marks of ty Theory total out of 200 : 120
Enter the marks of ty Practical total out of 200 : 150

 Roll no	Name	comTotal	mathTotal	ElcTotal	Theory		 prc: 
28		M	200		100		150		160		128
30		A	200		100		150		150		120


*/
