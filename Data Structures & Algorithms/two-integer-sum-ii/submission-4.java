class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int len = numbers.length;
        int[] ans = {0, 0};
        int left = 0;
        int right = len-1;
        while (left<right){

        if (numbers[left] + numbers[right] == target){
            ans[0] = left+1;
            ans[1] = right+1;
            return ans;
        } else if (numbers[left] + numbers[right] < target){
            left++;
        } else {
            right--;
        }
        }
        return ans;
    }
}
