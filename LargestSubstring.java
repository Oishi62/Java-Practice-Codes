import java.util.*;
class LargestSubstring 
{
    public static int  lengthOfLongestSubstring(String s) 
    {
     String t;
     char c=s.charAt(0);
     t=Character.toString(c);                
        for(int i=0;i<s.length();i++)
        {
            for(int j=i;j<s.length();j++)
            {
                
                if(isrepeat(s.substring(i,j+1))==true)
                    break;
                if(t.length()<=s.substring(i,j+1).length())
                {
                    t=s.substring(i,j+1);
                    
                }   
            }
        }
        return t.length();
        
    }
    static boolean isrepeat(String a)
    {
        int flag=0;
        for(int i=0;i<a.length()-1;i++)
        {
            for(int j=i+1;j<a.length();j++)
            {
                if(a.charAt(i)==a.charAt(j))
                {
                    flag=1;
                    break;
                }
            }
        }
        if(flag==1)
            return true;
        else
            return false;
    }
    public static void main()
    {
        int i;
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        if(s.equals(""))
            System.out.println("0");
        else
        {
            i=lengthOfLongestSubstring(s);
            System.out.println(i);
        }
           
    }
    
}