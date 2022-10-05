class Interest
{
      public static void main(String[] args)
      {
         double ri=8.5,rc=8.0;
         int t=10;
         int p=150000;
         double s,c;
         s=(p*ri*t)/100;
         double h=Math.pow((1+(rc/100)),t);
         c=(p*h)-p;
        
         if(c>s)
         System.out.println("The compound interest is more so this is a better option");
         else
         System.out.println(" The simple interest is more so this is a better option");
  }
}
     