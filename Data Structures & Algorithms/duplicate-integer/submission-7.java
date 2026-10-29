class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Boolean> map = new HashMap<>();
        int len = nums.length;
        for (int i =0; i<len; i++){
            if (map.get(nums[i]) == null){
                map.put(nums[i], true);
            } else {
                return true;
            }
        }
        return false;
    }
}