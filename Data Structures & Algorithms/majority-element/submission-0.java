class Solution {
    public int majorityElement(int[] nums) {
        int len = nums.length;
        int threshold = len/2;
        Map<Integer, Integer> hashmap = new HashMap<>();
        for (int i  = 0; i<len; i++){
            if (hashmap.get(nums[i]) == null){
                hashmap.put(nums[i], 1);
            } else {
                int val = hashmap.get(nums[i]) + 1;
                hashmap.put(nums[i], val);
            }
        }
        int max = 0;
        int maxind = 0;
        for (Map.Entry<Integer, Integer> entry : hashmap.entrySet()){
            if (entry.getValue() > max && entry.getValue() > threshold){
                max = entry.getValue();
                maxind = entry.getKey();
            }
        }
        return maxind;
    }
}