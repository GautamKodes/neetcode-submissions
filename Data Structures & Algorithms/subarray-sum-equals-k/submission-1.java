class Solution {
    public int subarraySum(int[] nums, int k) {
        int len = nums.length;
        int sols = 0;
        for (int i=0; i<len; i++){
            int tocheck = nums[i];
            if (tocheck == k){
                sols++;
            } if (i <len-1){
            for (int j = i+1; j<len; j++){
                int now = tocheck + nums[j];
                // if (now < k){
                //     tocheck = now;
                // } else if ( now == k){
                //     sols++;
                // }
                if (now == k){
                    sols++;
                }
                tocheck = now;
            }
            }
        }
        return sols;
    }
}