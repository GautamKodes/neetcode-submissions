class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> res = new ArrayList<>();
        int len = nums.length;
        int threshold = len/3;
        Map<Integer, Integer> hashmap = new HashMap<>();
        for (int i =0; i<len; i++){
            if (hashmap.get(nums[i]) != null){
                int val = hashmap.get(nums[i])+1;;
                hashmap.put(nums[i], val);
                // if (val == threshold){
                //     res.add(nums[i]);
                //     hashmap.put(nums[i], val);
                // } else {
                //     hashmap.put(nums[i], val);
                // }
            } else {
                hashmap.put(nums[i], 1);
            }
        }

        for (Map.Entry<Integer, Integer> map : hashmap.entrySet()){
            if (map.getValue() > threshold){
                res.add(map.getKey());
            }
        }
        return res;
    }
}