class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> map = new HashSet<>();
        int len = nums.length;
        for (int i =0; i<len; i++){
            if (map.contains(nums[i]) == false){
                // System.out.println("Exists");
                map.add(nums[i]);
            } else {
                // System.out.println("Not Exists");
                return true;
            }
        }
        return false;
    }
}