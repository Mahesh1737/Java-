import java.io.*;
import java.util.*;

class student
{
      int rno;
      static String name;
      float per;
      student (int r, String name1, float p) 
      {
              this.rno = r;
              this.name = name1;
              this.per = p;
      }
      
      float getper()
      {
            return per;
      }
              
      public static void sort(student s[], int n)
      {        
              
              for (int i=0;i<n;i++)
              {
                  for (int j=i+1;j<n;j++)
                  {
                      if (s[j].getper() < s[i].getper())
                      {
                         student temp = s[i];
                         s[i] = s[j];
                         s[j] = temp;
                      }
                   }
              }
           
       
       int k;
       System.out.println("\n Rollno:  Name:  percentage : ");   
       for (k=0;k<n;k++)   
       {
           System.out.print(" "+s[k].rno+" \t "+s[k].name+" \t "+s[k].per+" \n");
       }
       System.out.println(" ");
       }
       public static void main(String args[])
       {
             Scanner sc = new Scanner(System.in);
             System.out.print("Enter the Number of Student : ");
             int n = sc.nextInt();
             student s[] = new student[n];    
             for (int i=0;i<n;i++)   
             {
                 System.out.println("Enter data for student : "+(i+1));
                 System.out.print("Enter Roll no of student : ");
                 int r = sc.nextInt();
                 System.out.print("Enter the Name of Student : ");
                 String name1 = sc.next();
                 System.out.print("Enter the percentage of Student : ");
                 float p = sc.nextFloat();
                 
                 s[i] = new student(r, name1, p);
             }
             student.sort(s,n);
       }
}
                         
