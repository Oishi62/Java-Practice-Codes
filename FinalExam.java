import java.util.*;
class Cia
{
          double c;
          Cia()
          {
                 c=0.0;
           }
          void acceptCia()
          {
                      Scanner sc=new Scanner(System.in);
                      System.out.println("Enter the cia marks out of 20 ");
                      c=sc.nextDouble();
          }
}
class EndSem extends Cia
{
        double m;
        EndSem()
        {
              super();
              m=0.0;
        }

         void acceptMarks()
         {
                //super.acceptCia();
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter the marks out of 80");
                m=sc.nextDouble();
         }
}
class FinalExam 
{
        public static void main(String[] s)
        {
                EndSem ob[]=new EndSem[6]; 
                int a=1; double sum;
                for(int i=0;i<6;i++)
                {
                       System.out.println("Enter the marks for subject "+a++);
                       ob[i]=new EndSem();
                       ob[i].acceptCia();
                       ob[i].acceptMarks();
                       
                }
                a=1;
                for(int j=0;j<6;j++)
                {
                        
                       System.out.println(" Total marks for subject "+a++);
                       sum=ob[j].c+ob[j].m;
                       System.out.println(sum);
                }
         }
}

                  
 
      