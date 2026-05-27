class Solution {
    public boolean validPalindrome(String s) {
        int len = s.length();
        if (len <2){
            return true;
        }
        boolean skip = true;
        int i = 0;
        int j = len-1;
        while ( i < j){
                if (s.charAt(i) != s.charAt(j)){
                    if (isPalindrome(s, i+1, j) || isPalindrome(s, i, j-1)){
                        return true;
                    } else {
                        return false;
                    }
                } else {
                    i++;
                    j--;
                }
            }
        return true;
    }
        public boolean isPalindrome(String str, int i, int j){
            while ( i < j){
                if (str.charAt(i) != str.charAt(j)){
                    return false;
                } else {
                    i++;
                    j--;
                }
            }
            return true;
        }
}
