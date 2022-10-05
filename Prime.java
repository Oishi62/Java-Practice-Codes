class Prime
{
     public static void main(String[] s)
     {
           int l=Integer.parseInt(s[0]);
           int u=Integer.parseInt(s[1]);
           int i; boolean n;
           System.out.println("The prime numbers in the range of "+l+"-"+u+" are :");
           for(i=l; i<=u; i++)
           {
                n=isprime(i);
                if(n == true)
                System.out.println(i);
           }
      }
      public static boolean isprime(int a)
      {
          int i,c=0;
          boolean flag;
          for(i=2;i<=a;i++)
          {
              if(a%i==0)
              c++;
           }
           if(c>1)
           return false;
           else
           return true;
         }
}
      
                  
