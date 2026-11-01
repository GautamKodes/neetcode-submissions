class Solution {
    public boolean isAnagram(String s, String t) {
        int len1 = s.length();
        int len2 = t.length();
        if (len1 != len2){
            return false;
        }
        HashMap<Character, Integer> hashmap = new HashMap<>();

        for (int i = 0; i<len1; i++){
            char now = s.charAt(i);
            if (hashmap.get(now) == null){
                hashmap.put(now, 1);                
            } else {
                int val =  hashmap.get(now);
                hashmap.put(now, val+1);
            }
        }
        for (int i = 0; i<len2; i++){
            char now = t.charAt(i);
            if (hashmap.get(now) == null || hashmap.get(now) < 1){
                return false;
            } else {
                int val = hashmap.get(now);
                hashmap.put(now, val-1);
            }
        }
        return true;

    }
}