class Solution 
{
    public int strStr(String haystack, String needle) 
    {
        //DAY19
        int c = needle.length();

        if(haystack.length()==1)
        {
            if(haystack.equals(needle))
            return 0;
        }

        for(int i=0;i<=haystack.length()-c;i++)
        {
            if(c==1)
            {
                System.out.println(haystack.substring(i));
                if(haystack.substring(i).equals(needle))
                return i;
            }
            System.out.println(haystack.substring(i,i+c));
            if(haystack.substring(i,i+c).equals(needle))
            return i;
        }

        return -1;
    }
}