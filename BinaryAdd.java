import java.util.*;
class BinaryAdd
{
       public static void main(String[] a)
       {
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter the first binary number ");
                String s1=sc.next();
                System.out.println("Enter the second number ");
                String s2=sc.next();
                String s="";
                int c=0,i,j,l;
                int k=s1.length()-s2.length();
               
                if(k>0)
                {
                   for(j=1;j<=k;j++)
                   s2="0"+s2;
                }
                else if(k<0)
                {
                   for(l=1;l<=(-1*k);l++)
                   s1="0"+s1;  
                }
                
                char m,n;
                
                for(i=s1.length()-1;i>=0;i--)
                {
                         m=s1.charAt(i);
                         n=s2.charAt(i);
                         if(m=='0' && n=='0')
                         {
                                   if(c==0)
                                   {
                                          s="0"+s;
                                          continue;
                                    }
                                    if(c==1)
                                    {
                                          s="1"+s;
                                          c=0;
                                          continue;
                                    }
                          }
                                    if(m=='0' && n=='1' || m=='1' && n=='0')
                                    {   
                                             if(c==0)
                                            {
                                                     s="1"+s;
                                                     continue;
                                            }
                                            if(c==1)
                                            {
                                                  s="0"+s;
                                                  continue;  
                                            }
                                    }
                                    if(m=='1' && n=='1')
                                    {
                                           if(c==0)
                                           {
                                                s="0"+s;
                                                c=1;
                                                continue;
                                           }
                                           if(c==1)
                                           {
                                                s="1"+s;
                                                continue;
                                            }
                                      }
             
                          
                }
                if(c==1)
                s="1"+s;
                System.out.println(s);
       }
}
