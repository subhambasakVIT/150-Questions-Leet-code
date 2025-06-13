class Solution 
{
    public int lengthOfLongestSubstring(String s) 
    {   //DAY 8
        /*MySolution*
        int low =0;
        int high =0;
        ArrayList<Character> sub = new ArrayList<>();
        int currl = 0;
        int maxl = 0;
        for(high=0;high<s.length();high++)
        {
            if(!sub.contains(s.charAt(high)))
            {
                sub.add(s.charAt(high));
            }
            else
            {
                currl = sub.size();
                sub.remove(Character.valueOf(s.charAt(low)));
                //sub.add(s.charAt(high));
                low++;
            }
            maxl = Math.max(currl,maxl);
        }
        return maxl;*/
        int low =0;
        int high =0;
        ArrayList<Character> sub = new ArrayList<>();
        int maxl =0;
        while(high < s.length())
        {
            if(!sub.contains(s.charAt(high)))
            {
                sub.add(s.charAt(high));
                high++;
                maxl = Math.max(maxl,sub.size());
            }
            else
            {
                sub.remove(Character.valueOf(s.charAt(low)));
                low++;
            }
        }
        return maxl;
    }
}