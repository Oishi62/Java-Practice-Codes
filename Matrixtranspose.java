import java.util.*;
class MatrixTranspose{
    public static void rotate(int[][] matrix) 
    {
        int n=matrix.length;
        System.out.print(n);
        int b[][]=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
              b[i][j]=matrix[j][i];
        }
        for(int i=0;i<n;i++)
        {
            for(int j=n-1;j>=0;j++)
                System.out.print(b[i][j]);
            System.out.println();
        }
        
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of rows and columns");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int m[][]=new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                m[i][j]=sc.nextInt();
            }
        }
        rotate(m);
    }
}
