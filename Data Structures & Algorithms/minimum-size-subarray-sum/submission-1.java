class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int len = nums.length;
        int sum = 0;
        int minlen = Integer.MAX_VALUE;
        int i = 0;
        for (int  right= 0; right<len; right++){
            sum += nums[right];

            while (sum >= target){
                minlen = Math.min(minlen, right-i +1);
                sum -= nums[i];
                i++;
            }
        }
        return minlen == Integer.MAX_VALUE?0: minlen;
    }
}