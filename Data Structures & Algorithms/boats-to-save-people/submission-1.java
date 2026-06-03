class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int len = people.length;
        Arrays.sort(people);
        int i  = 0;
        int j = len-1;
        int count = 0;
        while (i<j){
            if (people[i] + people[j] <= limit){
                count++;
                i++;
                j--;
            } else {
                if (people[j] > people[i]){
                    count++;
                    j--;
                } else if (people[i] + people[i+1] <=limit){
                    count++;
                    i++;
                    i++;
                } else {
                    count++;
                    i++;
                }
            }
        }
        if (i==j){
            count++;
        }
        return count;
    }
}