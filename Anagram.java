import java.util.Scanner;

public class Anagram{

    static boolean isAnagram(String a, String b) 
    {
       // Complete the function
       a=a.toLowerCase();
       b=b.toLowerCase();
       if(a.length()==b.length())
        {
       
       
           char c1[]=new char[a.length()];
           char c2[]=new char[b.length()];
           int i;char c;
           for(i=0;i<a.length();i++)
           {
               c=a.charAt(i);
               c1[i]=c;
           }
           
           for(i=0;i<b.length();i++)
           {
               c=b.charAt(i);
               c2[i]=c;
           }
           int j;
           for(i=0;i<c1.length;i++)
           {
               for(j=1;j<c1.length-i;j++)
               {
                  if(c1[j-1]>c1[j])
                  {
                      c=c1[j-1];
                      c1[j-1]=c1[j];
                      c1[j]=c;
                  } 
               }
           }
           for(i=0;i<c2.length;i++)
           {
               for(j=1;j<c2.length-i;j++)
               {
                  if(c2[j-1]>c2[j])
                  {
                      c=c2[j-1];
                      c2[j-1]=c2[j];
                      c2[j]=c;
                  } 
               }
           }
           String m="",n="";
           for(i=0;i<c1.length;i++)
           {
               m=m+c1[i];
               n=n+c2[i];
           }
           System.out.println(m+ " "+n);
           if(m.equals(n)==true)
           return true;
           else
           return false;
           
           
           
        }
        else
        return false;    
             
    }
       
       
           
           
           
            
       
    

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
System.out.println("Enter string 1");
System.out.println("Enter string 2");
        String a = scan.nextLine();
        String b = scan.nextLine();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}