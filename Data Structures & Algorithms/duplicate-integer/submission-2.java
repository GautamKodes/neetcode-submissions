class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Boolean> map = new HashMap<>();
        int len = nums.length;
        for (int i =0; i<len; i++){
            if (map.get(nums[i]) == null){
                // System.out.println("Exists");
                map.put(nums[i], true);
            } else {
                // System.out.println("Not Exists");
                return true;
            }
        }
        return false;
    }
}