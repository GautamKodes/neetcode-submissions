class Solution {
    public int maxArea(int[] heights) {
        int len = heights.length;
        int max = 0;
        int left = 0;
        int right = len-1;
        while (left<right){
            if ( heights[left] <= heights[right]){
                int water = (right-left)*heights[left];
                System.out.println("left h: " + heights[left]);
                System.out.println("right h: " + heights[right]);
                System.out.println("left: " + left);
                System.out.println("right: " + right);
                System.out.println("water: " + water);
                if (water>max){
                    max = water;
                }
                left++;
            } else {
                int water = (right-left)*heights[right];
                System.out.println("left h: " + heights[left]);
                System.out.println("righ h: " + heights[right]);
                System.out.println("left: " + left);
                System.out.println("right: " + right);
                System.out.println("water: " + water);
                if (water>max){
                    max = water;
                }
                    right--;
            }
        }
        return max;
    }
}
