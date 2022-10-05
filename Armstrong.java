class Armstrong
{
       public static void main(String[] s)
       {
           for(int i=100;i<=999;i++)
            {
                  isArmstrong(i);
            }
       }
         static void isArmstrong(int n)
          {
                 int copy=n,c;int s=0;
                 while(copy>0)
                 {
                        c=copy%10;
                        s=s+c*c*c;
                        copy=copy/10;
                 }
                 if(n==s)
                  System.out.println(n);
             }
}
                                        
       