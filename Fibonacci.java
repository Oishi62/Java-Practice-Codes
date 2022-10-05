import java.util.*;
class Fibonacci
{
     public static void main(String[] s)
     {
             Scanner sc=new Scanner(System.in);
             System.out.println("Enter the number of terms you want the fibonacci series to contain ");
             int n=sc.nextInt();
             int a=0,b=1,c,i;
             System.out.println("The fibinacci series ");
             System.out.print(a+" "+b);
             for(i=1;i<=n;i++)
             {
                  c=a+b;
                  System.out.print(" "+c);
                  a=b;                                                                       
                  b=c;
              }
       }
}
     
                                                                                                