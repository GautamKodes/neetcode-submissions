class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int len = arr.length;
        List<Integer> list = new ArrayList<>();
        if (k == 1){
            int closest = -1;
            int minDiff = Integer.MAX_VALUE;
            for (int i = 0; i<len; i++){
                int diff = Math.abs(arr[i] - x);
                if (diff <= minDiff){
                    minDiff = diff;
                    closest = i;
                }
            }
            list.add(arr[closest]);
            return list;
        }
        int i = 0;
        int j = k-1;
        int diffSum = diffsum(i, j, x, arr);
        System.out.println("Difff sum: " + diffSum);
        System.out.println("Entering loop");
        while (j<len-1){
                i++;
                j++;
            int currentdiff = diffsum(i, j, x, arr); 
            System.out.println("CurrentDiff: " + currentdiff);
            if ( currentdiff < diffSum){
                System.out.println("Less true");
                diffSum = currentdiff;
                System.out.println("Difff sum: " + diffSum);
            } else {
                i--;
                j--;
                break;
            }
        }
        System.out.println("i,j: " + i + "" + j);
        for (int l = 0; l<k; l++){
            list.add(arr[i]);
            i++; 
        }
        return list;
    }
    int  diffsum(int a, int b, int x, int[] array){
        int diff = 0;
        int i = a;
        int j = b;
        while(i<=j){

        if (array[i] < x){
            diff += x-array[i];
        } else {
            diff += array[i]-x;
        }
        i++;
        }
        return diff;
    }
}