class Solution {
        int last = 0;
        int ans = 0;
    public int lengthOfLongestSubstring(String s) {
        for (int i = 0; i<s.length(); i++){
            int sol = sub(s, i);
            if (sol >ans){
                ans=sol;
            }
        }
        return ans;
    }

    int sub(String s, int i){
        Map<Character, Boolean> hashmap = new HashMap<>();
        last = 0;
        while ( i< s.length()){
            char now = s.charAt(i);
            if (hashmap.get(now) == null){
                hashmap.put(now, true);
                last++;
                i++;
            } else {
                return last;
            }
        }
        return last;
        }
}

