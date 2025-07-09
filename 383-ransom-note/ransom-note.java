class Solution 
{
    public boolean canConstruct(String ransomNote, String magazine) 
    {
        //DAY31
        int[] letters = new int[26];

        for (char c : magazine.toCharArray()) {
            letters[c - 'a']++;
        }

        for (char c : ransomNote.toCharArray()) {
            if (letters[c - 'a'] == 0) {
                return false;
            }
            letters[c - 'a']--;
        }

        return true;
    }
}