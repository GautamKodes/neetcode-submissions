class Solution {
    public int longestConsecutive(int[] nums) {
        int len = nums.length;

        Arrays.sort(nums);
        if (len <=1){
            return len;
        }
        int count = 1;
        int countmax = 1;
        for (int i = 0; i<len-1; i++){
            if (nums[i] != nums[i+1]){
            int now = nums[i] +1;
            if (now== nums[i+1]){
                count++;
            } else {
                if (count > countmax){
                    countmax = count;
                }
                count = 1;
            }
            }
        }
        if (count > countmax){
                    countmax = count;
                }
        return countmax;

        }
}
