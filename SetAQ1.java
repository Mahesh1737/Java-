import java.io.*;
import java.util.*;

class Employee
{
       static int id= 1;
       static String name="Mahesh";
       static String dept="Cs";
       static int sal= 100000;
       Employee()
       {
             this.id = id;
             this.name=name;
             this.dept=dept;
             this.sal=sal;
       }
       
       Employee(int i1, String n2, String dp, int sal1)
       {
             this.id = i1;
             this.name=n2;
             this.dept=dp;
             this.sal=sal1;
       }
       
       public static void display()
       {
               System.out.println("Id : "+id);
               System.out.println("Name : "+name);
               System.out.println("Department : "+dept);
               System.out.println("Salary : "+sal);
       }
       public static void main(String args[])
       {       
              Employee e1= new Employee();
              e1.display();
              Employee e2= new Employee(2,"ABC","XYZ",1000000);
              e2.display();
       }
}

/*

output: 

ty28@pc61:~/TY28/JAVA/ASSIGNMENT_02/Set_A$ javac SetAQ1.java
ty28@pc61:~/TY28/JAVA/ASSIGNMENT_02/Set_A$ java Employee
Id : 1
Name : Mahesh
Department : Cs
Salary : 100000
Id : 2
Name : ABC
Department : XYZ
Salary : 1000000


*/
