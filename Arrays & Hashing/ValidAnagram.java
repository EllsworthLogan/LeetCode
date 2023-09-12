class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        char[] az = new char[26];

        for (int i = 0; i < s.length(); i++) {
            az[s.charAt(i) - 'a']++;
            az[t.charAt(i) - 'a']--;
        }

        for (int j : az) {
            if (j != 0) {
                return false;
            }
        }

        return true;
    }    
}
