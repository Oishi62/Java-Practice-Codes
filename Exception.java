class Exception
{
         public static void main(String[] args)
         {
                  System.out.println("Before");
                  m();
                  System.out.println("After");
          }
            public static void m() throws ArithmeticException
            {
                   int a=10,b=0;
                   int c=a/b;
                   System.out.println(c);
            }
}
            
        