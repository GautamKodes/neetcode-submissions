class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Arrays.sort(nums);
        int len = nums.length;
        for (int i = 0; i<len; i++){
            int required = target - nums[i];
            for (int j = i+1; j<len; j++){
                if (nums[j] == required){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{0, 0};
    }
}
