import java.util.*;
class NonFibo
{
       public static void main(String[] s)
       {
                  Scanner sc=new Scanner(System.in);
                  System.out.println("Enter the upper limit");
                  int u=sc.nextInt();
                  int a=0,b=1,c,i,j;
                  for(i=0;i<=u;i++)
                  {
                       
                       c=a+b; 
                       for(j=a+1;j<b;j++) 
                       if(j<=u)
                       System.out.print(j+ " ");
                       a=b;
                       b=c;
         
                  }
           }
}