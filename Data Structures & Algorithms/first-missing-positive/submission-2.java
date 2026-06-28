class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        int tolook = 1;
        int i = 0;
        while (i<len){
            if (nums[i] > 0){
                if (nums[i] > tolook){
                    return tolook;
                } else if (nums[i] == tolook){
                    tolook++;
                }
            }
            i++;
        }
        return tolook;
    }
}