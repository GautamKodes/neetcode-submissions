class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int len = nums.length;
        if (len < 2){
            return false;
        } else {
            HashMap<Integer, Integer> hashmap = new HashMap<>();
            for (int i = 0; i<=len-1; i++){
                if (hashmap.get(nums[i]) == null){
                hashmap.put(nums[i], i);
                } else {
                    int diff = i - hashmap.get(nums[i]);
                    if (diff <= k){
                        return true;
                    } else {
                        hashmap.put(nums[i], i);
                    }
                }

            }
            return false;
        }
    }
}