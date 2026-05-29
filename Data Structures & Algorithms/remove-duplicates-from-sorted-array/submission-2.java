class Solution {
    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        int k = len;
        int dup = 1;

        if (len == 0){
            return 0;
        } else {
        for (int i = 1; i<len; i++){
            if (nums[i] == nums[i-1]){
                // dup = i;
                k--;
            } else {
                nums[dup] = nums[i];
                dup++; 
            }
        }
        }
        return dup;
    }
}