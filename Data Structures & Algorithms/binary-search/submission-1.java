class Solution {
    public int search(int[] nums, int target) {
        int len = nums.length-1;
            return look(0, len, target, nums);

    }
            int look(int low, int high, int target, int[] arr){
                if (low <= high){
            int mid = (low + high)/2;
            if (target >  arr[mid]){
                return look(mid+1, high, target, arr);
            } else if (target == arr[mid]){
                return mid;
            } else {
                return look(low, mid-1, target,arr);
            }
                } else {
                    return -1;
                }
        }
}
