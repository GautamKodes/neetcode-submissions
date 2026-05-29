class Solution {
    public int firstMissingPositive(int[] nums) {
        int len = nums.length;
        Arrays.sort(nums);
        int first = 1;
        for (int i = 0; i<len; i++){
            if (nums[i] > 0){
                if (nums[i] == first){
                    first++;
                } else if (nums[i] > first){
                    return first;
                }
            }
        }
        return first;
    }
}