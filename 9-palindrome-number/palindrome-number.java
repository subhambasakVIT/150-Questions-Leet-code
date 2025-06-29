class Solution 
{
    public boolean isPalindrome(int x) 
    {
        //DAY23
        int num = x;
        int s =0;
        while(num>0)
        {
            int r= num%10;
            s=s*10+r;
            num/=10;
        }
        return s==x;
    }
}