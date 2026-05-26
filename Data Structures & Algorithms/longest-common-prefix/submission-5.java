class Solution {
    public String longestCommonPrefix(String[] strs) {
        int len = strs.length;
        String output = "";
        int small = 0;
        int smallen = strs[small].length();
        int matchlen = -1;
        for (int i=0; i<len; i++){
            if (strs[i].length() < smallen){
                small = i;
                smallen = strs[i].length();
            }
        }

        for (int i=0; i<smallen;i++){
            for (int j=0; j<len; j++){
                if ( strs[j].charAt(i) != strs[small].charAt(i) ){
                    return output = strs[small].substring(0, matchlen+1);
                }
            }
            matchlen++;
        }
        return strs[small];

    }
}