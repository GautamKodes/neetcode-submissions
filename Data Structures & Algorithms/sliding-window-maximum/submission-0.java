class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        // List<Integer> list = new ArrayList<>();
        int len = nums.length;
        int[] sol = new int[len-k+1];
        int solindex = 0;
        int start = 0;
        int end = k-1;
        int maxindex = maximumIndex(nums, start, end);
        sol[solindex] = nums[maxindex];
        solindex++;
        start++;
        end++;
        while (end<len){
            if (start<maxindex){
                if (nums[end] >= nums[maxindex]){
                    maxindex = end;
                    sol[solindex] = nums[maxindex];
                    solindex++;
                } else{
                    sol[solindex] = nums[maxindex];
                    solindex++;
                }
                start++;
                end++;
            } else {
                maxindex = maximumIndex(nums, start, end);
                sol[solindex] = nums[maxindex];
                solindex++;
                start++;
                end++;
            }
        }
        return sol;
    }

    int maximumIndex(int[] arr, int start, int end){
        int max = arr[start];
        int maxindex = start;
        while (start<=end){
            if (arr[start] > max){
                max = arr[start];
                maxindex = start;
            }
            start++;
        }
        return maxindex;
    }
}
