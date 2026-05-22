class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] sol = new int[2];
        int len = nums.length;
        // for (int i = 0; i<len-1; i++){
        //     if (nums[i]>nums[i+1]){
        //         nums[i] = nums[i] - nums[i+1];
        //         nums[i+1] = nums[i+1] + nums[i];
        //         i--;
        //     }
        // }

        for (int i = 0; i<len-1; i++){
            int diff = target-nums[i];
            for (int j=i+1; j<len; j++){
                if (nums[j] == diff){
                    sol[0] = i;
                    sol[1] = j;
                    return sol;
                }
            }
        }
        return sol;
    }
}
