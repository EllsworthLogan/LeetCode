class Solution {
    public boolean isPalindrome(String s) {
        if (s.length() == 0) {
            return true;
        }

        int i = 0;
        int j = s.length() - 1;

        Character left;
        Character right;

        while(i < j) {
            left = s.charAt(i);
            right = s.charAt(j);
            
            if (!Character.isLetterOrDigit(left)) {
                i++;
                continue;
            }
            if (!Character.isLetterOrDigit(right)) {
                j--;
                continue;
            }
            if (Character.toLowerCase(left) != Character.toLowerCase(right)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
