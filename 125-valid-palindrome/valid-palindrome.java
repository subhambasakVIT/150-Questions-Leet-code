class Solution 
{
    public boolean isPalindrome(String s) 
    {
        //DAY 6 (1st Two Pointer)
        s = s.toLowerCase().replaceAll("[^A-Za-z0-9]","");
        int i = 0;
        int j = s.length()-1;
        while(i<=j)
        {
            if(s.charAt(i) != s.charAt(j))
            return false;
            i++ ;
            j-- ;
        }
        return true;
    }
}