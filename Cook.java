class A
{
  private int m;
  protected String s="A data member of base class";
       A()
       {
           System.out.println("In A");
       }
       A(int m)
       {
           this.m=m;
           System.out.println("In A"+m);
        }
        void show()
        {
            System.out.println("Member of class A");
        }
}
class B extends A
{
   private int n;
       B()
       {
           System.out.println("In B");
       }
       B(int m,int n)
       {
           super(m);
           this.n=n;
           System.out.println("In B"+n);
        }
        void show()
        {
            String s="A data member of class B";
            System.out.println("Member of class B");
            System.out.println(super.s+" being displayed in class B");
            super.show(); 
        }  
}
class Cook
{
     public static void main(String[] args)
     {
            B ob1=new B();
            B ob2=new B(10,20);
            ob1.show();
     }
}

  
           

       