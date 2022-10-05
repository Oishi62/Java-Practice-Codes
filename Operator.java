class Operator
{
    public static void main(String[] s)
    {
           int n1=Integer.parseInt(s[0]);
           int n2=Integer.parseInt(s[2]);
           char ch=s[1].charAt(0);
           switch(ch)
           {
               case '+':
               System.out.println("The sum of the two numbers "+n1+" and "+n2+" is "+(n1+n2));
               break;
               case '-':
               System.out.println("The difference between the two numbers "+n1+" and "+n2+" is "+(n1-n2));
               break;
               case 'x':
               System.out.println("The product of the two numbers "+n1+" and "+n2+" is "+(n1*n2));
               break;
               case '/':
               System.out.println("The division between the two numbers "+n1+" and "+n2+" is "+(n1/n2));
               break;
               default:
               System.out.println("Wrong choice of operators");
            }
     }
}
