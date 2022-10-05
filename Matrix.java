import java.util.*;
class Matrix
{
     public static void main(String[] s)
     {
            int r1,c1,r2,c2;
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the number of rows of the first matrix ");
            r1=sc.nextInt();
            System.out.println("Enter the number of columns of the first matrix ");
            c1=sc.nextInt();
            System.out.println("Enter the number of rows of the second matrix ");
            r2=sc.nextInt();
            System.out.println("Enter the number of columns of the second matrix ");
            c2=sc.nextInt(); 
            int m[][]=new int[r1][c1];
            int n[][]=new int[r2][c2];
            int i,j,k;
            for(i=0;i<r1;i++)
            {
                for(j=0;j<c1;j++)
                { 
                  System.out.println("Enter element at index ["+i+"] ["+j+"]");          
                  m[i][j]=sc.nextInt();
                }
             }
             for(i=0;i<r2;i++)
            {
               for(j=0;j<c2;j++)
               {   
                   System.out.println("Enter element at index ["+i+"] ["+j+"]");
                   n[i][j]=sc.nextInt();
                }
            }
             if((r1!=r2) && (c1!=c2))
               System.out.println("Matrix addition not possible");
            else
                  {
                           
                            int add[][]=new int[r1][c2];
                            for(i=0;i<r1;i++)
                            {
                                   for(j=0;j<c2;j++)
                                         add[i][j]=m[i][j]+n[i][j];
                            }
                        System.out.println("The addition of the two matrices is ");
                         for(i=0;i<r1;i++)
                            {
                                   for(j=0;j<c2;j++)
                                        System.out.print(add[i][j]+" ");
                               System.out.println();
                            }
                    }
              if(c1!=r2)
                 System.out.println("Matrix Multiplication not possible ");
              else
              {

                          int mul[][]=new int[r1][c2];
                          for(i=0;i<r1;i++)
                          {
                                    for(j=0;j<c2;j++)
                                    {
                                        for(k=0;k<c1;k++)
                                           mul[i][j]+= m[i][k]*n[k][j];
                                    }
                           }
                           System.out.println("The multiplication of the two matrices is ");
                         for(i=0;i<r1;i++)
                            {
                                   for(j=0;j<c2;j++)
                                        System.out.print(mul[i][j]+" ");
                               System.out.println();
                             }
                }
     }
}
      
