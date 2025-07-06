class Solution 
{
    public int trailingZeroes(int n) 
    {
        //DAY 28
        int res = 0;
        while(n>0)
        {
            n/=5;
            res+=n;
        }
        return res;
    }
}