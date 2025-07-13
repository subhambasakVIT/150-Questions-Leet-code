class Solution 
{
    public boolean isIsomorphic(String s, String t) 
    {
        //DAY35
        if (s.length() != t.length()) return false;

        Map<Character, Character> map = new HashMap<>();
        Set<Character> mapped = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);

            if (map.containsKey(ch1)) {
                if (map.get(ch1) != ch2) {
                    return false;
                }
            } else {
                if (mapped.contains(ch2)) {
                    return false;
                }
                map.put(ch1, ch2);
                mapped.add(ch2);
            }
        }

        return true;
    }
}