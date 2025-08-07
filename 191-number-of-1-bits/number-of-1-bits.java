class Solution 
{
    public int hammingWeight(int n) 
    {
        //DAY50
        int c=0;
        String bs = Integer.toBinaryString(n);
        for(int i=0;i< bs.length();i++)
        {
            if(bs.charAt(i) == '1')
            c++;
        }
        return c;
    }
}