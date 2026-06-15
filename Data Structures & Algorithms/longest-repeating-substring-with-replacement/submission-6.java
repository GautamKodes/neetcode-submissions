class Solution {
    public int characterReplacement(String s, int k) {
        int len = s.length();
        int maximum = 0;
        for (int i = 0; i<len; i++){
        int count = 1;
        int replacements = k;
        int j = i+1;
        while(j<len && replacements>=0){
            // System.out.println("k: " + replacements);
            // System.out.println("count: " + count);
            if (s.charAt(j) == s.charAt(i)){
                count++;
                // System.out.println("Adding count: " + i + "=" + j);
                // System.out.println("count: " + count);
            } else {
                if (replacements <= 0){
                    break;
                } else {
                count++;
                // System.out.println("Adding count: " + i + "NOT =" + j);
                // System.out.println("count: " + count);
                // System.out.println("k: " + replacements);
                replacements--;
                }
            }
                j++;
        }
        if (replacements > 0){
            if (count + replacements >= len){
                return len;
            } else {
                if (count + replacements > maximum){

                maximum = count + replacements;
                }
            }
        } else {
        if (count > maximum){
            // System.out.println("Final count: " + count);
            maximum = count;
        }
        }
        }
    return maximum;
    }
}
