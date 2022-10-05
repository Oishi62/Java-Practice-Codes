import java.lang.*;
class LongestPalindrome {
    public String longestPalindrome(String s) 
    {
        int l=0;
        String m="";
        String reverse="";
        for(int i=0;i<s.length();i++)
        {
            for(int j=i;j<s.length();j++)
            {
                 StringBuffer sbf = new StringBuffer(s.substring(i,j+1));
                 reverse=sbf.reverse().toString();
                if(reverse.equalsIgnoreCase(s.substring(i,j+1)) && l<=s.substring(i,j+1).length())
                {
                    m=s.substring(i,j+1); 
                    l=m.length();
                }
                
                
            }
        }
        return m;
    }
   
}