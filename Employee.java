import java.util.*;
class Employee
{     
     String name="";String a="";
     int y=0;
     double salary=0.0;
     static int i=0;
     public void input()
     {   
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the name of employee number "+ (++i));
         name=sc.nextLine();
           System.out.println("Enter the address ");
         a=sc.nextLine();
         System.out.println("Enter the year of joining ");
         y=sc.nextInt();
         
         System.out.println("Enter the salary  ");
         salary=sc.nextDouble();
        }
     public static void main(String[] s)
     {
         Employee ob1=new Employee();
         Employee ob2=new Employee();
         Employee ob3=new Employee();
         ob1.input();
         ob2.input();
         ob3.input();
         System.out.println("Name \t Year of joining \t Address \t Salary");
         System.out.println(ob1.name+"\t"+ob1.y+"\t"+ob1.a+"\t"+ob1.salary);
         System.out.println(ob2.name+"\t"+ob2.y+"\t"+ob2.a+"\t"+ob2.salary);
         System.out.println(ob3.name+"\t"+ob3.y+"\t"+ob3.a+"\t"+ob3.salary);
        }
    }
    
         
 