abstract class Super
{
  protected int n;
  Super(int a)
  {
       n=a;
   }
   void display()
   {
      
   }
  abstract public void something();
 }
   class Sub1 extends Super
   {
          Super(int x)
          {
              super(x);
           }
          public void something()
          {
                 

             
          }
      
   }
 class Sub2 extends Super
{
         public void something()
         {
                                 
             
          }
}
class Demo()
{
   public static void main()
   {
          Super r;
          r=new Sub1(14);
          r.display();
          r.something();
          r=new Sub2(14);
          r.display();
          r.something();
   }
}

 
          





