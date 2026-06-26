class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int i = 0;
        int len = nums.length;
        while (i <len){
            if (!set.contains(nums[i])){
                set.add(nums[i]);
            } else {
                return nums[i];
            }
            i++;
        }
        return 0;
    }
}
