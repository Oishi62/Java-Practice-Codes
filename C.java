class A
{
       void m()
      {
                   System.out.println("In A");
      }
      void showA()
      {
              System.out.println("Hello welcome to A");
      }
 }
 
class B extends A
{
        void m()
        {
                    System.out.println("In b");
       }
       void showB()
        {
                     System.out.println("Hello wlcome to B");
        }
}

class C
{
     public static void main(String[] args)
     {
               A r;
               r=new A();
               r.m();
               r.showA();
               B r1=new B();
               r1.m();
                r1.showB();
               
      }
}