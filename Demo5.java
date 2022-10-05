class Super
{
  public void display()
  {
           System.out.println("Hi");
   }
}
class Sub extends Super
{
    public void display()
    {
         System.out.println("Welcome");
    }
}
class Demo5
{
 public static void main()
 {
            Super r;
            r=new Sub();
            r.display();
  }
}