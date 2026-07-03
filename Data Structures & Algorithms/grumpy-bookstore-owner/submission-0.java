class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {

        int len = customers.length;
        int sum = 0;
        int max = 0;
        int maxind = 0;
        for (int i = 0; i<len; i++){
            if (grumpy[i] == 0){
                sum += customers[i];
            }
        }

        int i = 0;
        int j = minutes-1;
        int current_max = 0;

        while (i<=j){
            if (grumpy[i]==1){
                max += customers[i];
            }
            i++;
        }
        i =1;
        j = minutes;
        current_max = max;
        while (j<len){
            if (grumpy[j] == 1){
                current_max += customers[j];
            }

            if (grumpy[i-1]==1){
                current_max -= customers[i-1];
            }

            if (current_max > max){
                max = current_max;
            }
            i++;
            j++;
        }
        return sum + max;

        // 1 + 0 + 1 = 2 max = 0
        // 0 + 1 + 2 = 2 max = 2
        // 1   2   1 = 3 max = 2
        // 2   1   1 = 3 max = 3
        // 1   1   7 = 10 max = 1
        // 1   7   5 = 10 max = 6

    }
}