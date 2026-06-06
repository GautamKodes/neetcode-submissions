class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int len1 = s1.length();
        int len2 = s2.length();
        char first[] = s1.toCharArray();
        Arrays.sort(first);
        for (int i=0; i<=len2-len1; i++){
            String now = s2.substring(i, i+len1);
            char temp[] = now.toCharArray();
            Arrays.sort(temp);
            int j = 0;
            while (j<len1){
                if (first[j] != temp[j]){
                    break;
                } else {
                    if (j+1 == len1){
                        return true;
                    }
                    j++;
                }
            }
        }
        return false;
    }
}
