class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int len = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> sols = new ArrayList<>();
        int i = 0;
        while (i<=len-3){
            if (i!=0  && nums[i] == nums[i-1]){
                i++;
            } else {

        int right = len-1;
        int left  = i+1;
        while (left<right){
            List<Integer> pair = new ArrayList<>();
            pair.add(nums[i]);
            int sum = nums[left] + nums[right] + nums[i];
            if (sum == 0){
                pair.add(nums[left]);
                pair.add(nums[right]);
                sols.add(pair);
                left++;
                while (left < right && nums[left] ==  nums[left-1]){
                    left++;
                }
                right--;
                while (left < right && nums[right] ==  nums[right+1]){
                    right--;
                }

            } else if ( sum > 0){ 
                right--;
                while (left < right && nums[right] ==  nums[right+1]){
                    right--;
                }
            } else {
                left++;
                while (left < right && nums[left] ==  nums[left-1]){
                    left++;
                }
            }
        }
        i++;
            }
        }
        return sols;
        //-4 -1 -1 0 1 2 len  = 6
    }
}
