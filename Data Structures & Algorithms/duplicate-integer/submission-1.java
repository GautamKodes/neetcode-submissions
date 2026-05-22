class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Boolean> hashmap = new HashMap<>();
        for (int i = 0; i<nums.length; i++){
                if (hashmap.get(nums[i]) == null){
                    hashmap.put(nums[i], false);
                } else {
                    return true;
                }
        }
        return false;
    }
}