class Solution 
{
    public boolean isAnagram(String s, String t) 
    {
        //DAY38
        if(s.length() != t.length())
        return false;

        HashMap<Character,Integer> map = new HashMap<>();

        for(char c: s.toCharArray())
        {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : t.toCharArray()) {
            if (!map.containsKey(c)) return false;

            map.put(c, map.get(c) - 1);
            if (map.get(c) < 0) return false;
        }

        return true;
    }
}