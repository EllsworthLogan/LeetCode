class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.length() > t.length()) {
            return false;
        }
        if (s.length() == 0) {
            return true;
        }

        int j = 0;
        int lastSeen;
        for (int i = 0; i < s.length(); i++) {
            lastSeen = t.indexOf(s.charAt(i), j);
            if (lastSeen == -1) {
                return false;
            }
            j = lastSeen + 1;
        }

        return true;
    }
}
