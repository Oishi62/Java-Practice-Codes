import java.util.*;
interface Stack
{
        boolean push(int x);
        int pop();
}
 
class DataStruct implements Stack
{
       int a[];
       int top=-1;
       public boolean push(int x)
       {
              if(top>= (a.length-1))
              {    
                    System.out.println("Stack Overflow");
                    return false;
               }
               else
               {
                      a[++top]=x;
                      System.out.println(x+" pushed into stack");
                      return true;
                }
          }
          public int pop()
          {
                    if(top<0)
                    {
                        System.out.println("Stack Underflow");
                        return 0;
                     }
                     else
                     {
                         int x=a[top--];
                         System.out.println(x+" is popped from the stack");
                         display();
                         return x;
                      }
            }
            public void display()
            {
                for(int i=top-1;i>=0;i--)
                System.out.println(a[i]);
            }
            public static void main(String[] s)
            {
                  Scanner sc=new Scanner(System.in);
                  System.out.println("Enter the size of the stack");
                  int n=sc.nextInt();
                  DataStruct ob=new DataStruct();
                  ob.a=new int[n];
                  while(true)
                  {
                  System.out.println("Enter what operation you want to perform 1 for push, 2 for pop and 3 for exit");
                  int c=sc.nextInt();
                  int v,u;
                  switch(c)
                  {
                     case 1:
                                 System.out.println("Enter the number of elements you want to add to the stack");
                                 v=sc.nextInt();
                                 System.out.println("Enter the elements");
                                 for(int i=1;i<=v;i++)
                                     ob.push(sc.nextInt());
                                 ob.display();
                                 break;
                     case 2:
                                 System.out.println("Enter the number of elements you want to delete from the stack"); 
                                 u=sc.nextInt();
                                 for(int i=1;i<=u;i++)
                                    ob.pop();
                                 break;
                     case 3:
                                 System.exit(0);
                                 break;
                      default:
                                  System.out.println("Wrong choice");
                     }
                     }
             }
}

