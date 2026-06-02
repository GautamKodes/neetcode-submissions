class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int len = numbers.length;
        int[] ans = {0, 0};
        if (len <3){
            ans[0] = 1;
            ans[1] = 2;
            return ans;
        } else {

        int i = 0;
        int j = 1;
        while (j<len){
            int toFind = target - numbers[i];
            if (j == i){
                j++;
            } else if (numbers[j] == toFind){
                ans[0] = i+1;
                ans[1] = j+1;
                return ans;
            } else if (numbers[j] > toFind){
                i++;
                j=i+1;
            } else if (j == len-1){
                i++;
                j=i+1;
            } else {
                j++;
            }
        }
        }
        return ans;
    }
}
