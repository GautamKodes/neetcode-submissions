class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int len = nums.length;
        map.put(nums[0], 0);
        for (int i = 1; i<len; i++){
            int diff = target - nums[i];
            if (map.get(diff) != null){
                return new int[]{map.get(diff), i};
            } else {
                map.put(nums[i], i);
            }
        }
        return new int[]{0, 0};
    }
}
