import java.util.*;
class Number
{
           public static void main(String[] args)
           {
                  Scanner sc=new Scanner(System.in);
                  System.out.println("Enter the number ");
                  int n=sc.nextInt();
                  int s=0,r=0,d;
                  
                  while(n>0)
                  {
                      d=n%10;
                      r=r*10+d;
                      s=s+d;
                      n=n/10;
                   }
                 
               System.out.println("The sum of the digits of the number is "+s);
               System.out.println("The reverse of the number is "+r);
             }
}
   