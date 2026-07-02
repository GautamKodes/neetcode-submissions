class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int len = arr.length; //5
        int avg = 0;
        int count = 0;
        for (int i = 0; i<k; i++){
            avg += arr[i];
        }
        avg /= k;
        int i = 0;
        int j = k;
        if (avg >= threshold){
            count++;
        }

        while (j<len){
            avg = ((avg * k) - arr[i] + arr[j])/k;
            i++;
            j++;

            if (avg>=threshold){
                count++;
            }
        }
        return count;


    }
}