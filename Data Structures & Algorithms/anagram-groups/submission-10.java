class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int len = strs.length;
        List<List<String>> groups = new ArrayList<>();
        boolean[] visited = new boolean[len];
        for (int i = 0; i<len; i++){
            int slen = strs[i].length();
            if (!visited[i]){
            visited[i] = true;
            List<String> subList = new ArrayList<>();
            subList.add(strs[i]);
            for (int j = i+1; j<len; j++){
                int tlen = strs[j].length();
                if (tlen != slen){
                    continue;
                }
                if (checkAnagram(strs[i], strs[j], slen) == true){
                    subList.add(strs[j]);
                    visited[j] = true;
                } else {
                    continue;
                }
            }
            groups.add(subList);
            }
        }
        return groups;
    }
    boolean checkAnagram(String s, String t, int slen){
                int[] list = new int[26];
                for (int i = 0; i<slen; i++){
                    int current = s.charAt(i);
                    list[122-current] += 1;
                }
                for (int i = 0; i<slen; i++){
                    int current = t.charAt(i);
                    if (list[122-current] == 0){
                        return false;
                    } else {
                    list[122-current] -= 1;
                    }
                }
                return true;
        }
}
