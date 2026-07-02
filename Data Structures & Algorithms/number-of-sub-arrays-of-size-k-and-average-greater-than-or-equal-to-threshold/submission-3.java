class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int len = arr.length;
        int avg = 0;
        int count = 0;
        int sum = 0;
        for (int i = 0; i<k; i++){
            sum += arr[i];
        }
        avg = sum/k;
        int i = 0;
        int j = k;
        if (avg >= threshold){
            count++;
        }

        while (j<len){
            sum -=arr[i];
            sum += arr[j];
            avg = sum/k;
            i++;
            j++;

            if (avg>=threshold){
                count++;
            }
        }
        return count;


    }
}