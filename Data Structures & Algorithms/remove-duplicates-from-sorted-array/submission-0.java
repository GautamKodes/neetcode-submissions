class Solution {
    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        int k = len;
        for (int i =1; i<len; i++){
            if (nums[i] == nums[i-1]){
                for (int j=i; j<len-1; j++){
                    nums[j] = nums[j+1];
                }
                len--;
                k--;
                i--;
            }
        }
        return k;
    }
}