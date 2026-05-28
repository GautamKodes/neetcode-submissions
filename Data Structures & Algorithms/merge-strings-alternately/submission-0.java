class Solution {
    public String mergeAlternately(String word1, String word2) {
        int len1 = word1.length();
        int len2 = word2.length();
        String res = "";
        int j = 0;
        int i = 0;
        while (i<len1 && i<len2){
            res = res + Character.toString(word1.charAt(i)) + Character.toString(word2.charAt(j));
            i++;
            j++;
        }

            while (i<len1){
                res = res + Character.toString(word1.charAt(i));
                i++;
            }
            while (j<len2){
            res = res + Character.toString(word2.charAt(j));
            j++;
            }
        return res;
    }
}