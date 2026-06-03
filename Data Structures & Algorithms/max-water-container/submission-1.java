class Solution {
    public int maxArea(int[] heights) {
        int len = heights.length;
        int max = 0;
        int left = 0;
        int right = len-1;
        while (left<right){
            if ( heights[left] <= heights[right]){
                int water = (right-left)*heights[left];
                if (water>max){
                    max = water;
                }
                left++;
            } else {
                int water = (right-left)*heights[right];
                if (water>max){
                    max = water;
                }
                    right--;
            }
        }
        return max;
    }
}
