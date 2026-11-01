class Solution {
    public boolean isAnagram(String s, String t) {
        int len = s.length();
        if (len != t.length()){
            // System.out.println("Exit on len");
            return false;
        }
        int[] list = new int[26];


        for (int i = 0; i<len; i++){
            char current = s.charAt(i);
            list[122-current] += 1;
        }

        for (int j = 0; j<len; j++){
            char current = t.charAt(j);
            if (list[122-current] == 0){
                // System.out.println("Exit");
                return false;
            }
            list[122-current] -= 1;
        }
        return true;
    }
}
