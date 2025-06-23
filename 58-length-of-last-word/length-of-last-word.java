class Solution 
{
    public int lengthOfLastWord(String s) 
    {
       //DAY17 
       int c=0;
       s= s.trim();
       if(s.length()==1 && s != " ")
       return 1;
       
       int i=s.length()-1;
       System.out.println(s+" "+i);
       while(i>-1)
       {
        
        if(s.charAt(i) ==' ')
        {
            break;
        }
            c++;
            i--;
       }
       return c;
    }
}