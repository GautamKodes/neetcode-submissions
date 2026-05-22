class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int variety = 0;
        int[] output = new int[k];
        Map<Integer, Integer> hashmap = new HashMap<>();
        int len = nums.length;
        for (int i = 0; i<len; i++){
            if (hashmap.get(nums[i]) == null){
                variety++;
                hashmap.put(nums[i], 1);
            } else {
                int nowcount = hashmap.get(nums[i]);
                hashmap.put(nums[i], nowcount+1);
            }
        }
        int[][] freak = new int[variety][2];
            int l =0;



        for (Map.Entry<Integer, Integer> entry : hashmap.entrySet()){
            freak[l][0] = entry.getKey();
            freak[l][1] = entry.getValue();
            l++;
        }
        // for (Integer)
        // for (int i = 0; i<len; i++){
        //     if (hashmap.get(nums[i]) == null || hashmap.get(nums[i]) == -1){
        //         continue;
        //     } else {
        //         freak[l][0] = nums[i];
        //         freak[l][1] = hashmap.get(nums[i]);
        //         hashmap.put(nums[i], -1);
        //         l++;
        //     }
        // }
        Arrays.sort(freak, (a, b) -> b[1]-a[1]);
        for (int m = 0; m<k; m++){
            output[m] = freak[m][0];
        }
        return output;
    }
}
