class Solution {
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        k%=len;
        reverse(nums, 0, len-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, len-1);
    }
    void reverse(int[] arr, int l, int h){
        int len = arr.length;
        int i = l;
        int j = h;
        while (i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}