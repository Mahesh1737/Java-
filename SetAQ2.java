import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Student
{
                int rollno;
                String name;
                float per;
                static int count;

                Student(){}
                Student(int rol1, String n,float p)
                {
                                rollno = rol1;
                             
                                name=n;
                                per=p;

                }

                void display()
                {
                                System.out.println(   rollno+"\t"   +name+"\t"   +per);
                }
                float getper()
                {
                                return per;
                }
                static void counter()
                {
                                System.out.println(count+" object is created");
                }
                public static void sortStudent(Student s[],int n)
                {
                                for(int i=n-1;i>=0;i--)
                                {
                                                for(int j=0;j<i;j++)
                                                {
                                                                if(s[j].getper()>s[j+1].getper())
                                                                {
                                                                                Student t=s[j];
                                                                                s[j]=s[j+1];
                                                                                s[j+1]=t;
                                                                }
                                                }
                                }
                                System.out.println("\nRollno  Name  percentage  ");   
                                for(int i=0;i<n;i++)
                                                s[i].display();

                }

                public static void main(String args[])
                {
                                Scanner sc = new Scanner(System.in);
                                
                                System.out.println("Enter no. of Student:");
                                
                                int n = sc.nextInt();
                                Student p[]=new Student[n];
                                for(int i=0;i<n;i++)
                                {
                                                System.out.print("Enter ID:");
                                                int id = sc.nextInt();
                                                
                                                System.out.print("Enter Name:");
                                                
                                                String name = sc.next();
                                                
                                                System.out.print("Enter percentage:");
                                                
                                                float per = sc.nextFloat();
                                                
                                                p[i]=new Student(id,name,per);
                                               
                                }
                                Student.sortStudent(p,n);
                }
}

/*

Output : 

ty28@pc61:~/TY28/JAVA/ASSIGNMENT_02/Set_A$ javac SetAQ2.java
ty28@pc61:~/TY28/JAVA/ASSIGNMENT_02/Set_A$ java Student
Enter no. of Student:
5
Enter ID:1 
Enter Name:mah
Enter percentage:56
Enter ID:2  
Enter Name:mon
Enter percentage:89
Enter ID:3
Enter Name:ath
Enter percentage:78
Enter ID:4
Enter Name:rup
Enter percentage:67
Enter ID:5
Enter Name:kun
Enter percentage:45

 Rollno:  Name:  percentage : 
5	kun	45.0
1	mah	56.0
4	rup	67.0
3	ath	78.0
2	mon	89.0


*/


                         
