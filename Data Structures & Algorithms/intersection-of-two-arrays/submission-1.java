class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        // ArrayList<Integer> output = new ArrayList<>();
        Map<Integer, Boolean> hashmap = new HashMap<>();
        for (int i=0; i<len1; i++){
            hashmap.put(nums1[i], true);
                }

        int o = 0;
        for (int i=0; i<len2; i++){
                    if (hashmap.get(nums2[i]) != null && hashmap.get(nums2[i]) == true){
                        hashmap.put(nums2[i], false);
                        o++;
                    } else {
                        continue;
                    }
            }
            int[] output = new int[o];
            int k = 0;
            for (Map.Entry<Integer, Boolean> entry : hashmap.entrySet()){
                if(entry.getValue() != null && entry.getValue() == false){
                    output[k] = entry.getKey();
                    k++;
                }
            }  
        return output;
        }
    
            }