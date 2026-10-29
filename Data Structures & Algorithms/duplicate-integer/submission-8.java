class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> map = new HashSet<>();
        int len = nums.length;
        for (int i =0; i<len; i++){
            if (map.add(nums[i])){
                continue;
            } else {
                return true;
            }
        }
        return false;
    }
}