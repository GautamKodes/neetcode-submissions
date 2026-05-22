class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] sol = new int[2];
        int len = nums.length;
        HashMap<Integer,Integer> hashmap = new HashMap<>();
        for (int i = 0; i<len; i++){
            int diff = target-nums[i];
            if (hashmap.get(diff) != null && hashmap.get(diff) != i){
                sol[0] = hashmap.get(diff);
                sol[1] = i;
                return sol;
            }
            hashmap.put(nums[i], i);
        }
        return sol;
    }
}
