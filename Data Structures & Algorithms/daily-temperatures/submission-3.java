class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int len = temperatures.length;
        int[] outp = new int[len];
        int j = 0;
        int i = 1;
        int count = 1;
        while (j<len-1){
            if (temperatures[i] > temperatures[j]){
                outp[j] = count;
                j++;
                i = j;
                count = 0;
            } else if (i == len-1){
                outp[j] = 0;
                j++;
                i = j;
                count = 0;
            }
            i++;
            count++;
        }
        return outp;
    }
}
