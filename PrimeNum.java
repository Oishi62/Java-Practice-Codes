class PrimeNum
{
       public static void main(String[] s)
       {
                int m=Integer.parseInt(s[0]);
                int n=Integer.parseInt(s[1]);
                boolean flag;
                 int i;
                System.out.println("The prime numbers in the given range ");
                for(i=m;i<=n;i++)
                {
                     flag=isPrime(i);
                     if(flag==true)
                     System.out.println(i);
                }
         }
         public static boolean isPrime(int a)
         {
                 int j,c=0;
                 for(j=2;j<=a;j++)
                 {      
                        if(a%j==0)
                         c++;
                       
                  }
                if(c==1)
                 return true;
                else
                 return false;
         }
}    
                               