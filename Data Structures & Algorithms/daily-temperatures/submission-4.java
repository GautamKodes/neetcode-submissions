class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int len = temperatures.length;
        int[] outp = new int[len];
        Stack<int[]> s = new Stack<>();
        // s.push(temperatures[0], 0);
        for (int i = 0; i<len; i++){
            while (!s.isEmpty() && temperatures[i] > s.peek()[0]){
                outp[s.peek()[1]] = i - s.pop()[1]; 
            }
                int[] now = {temperatures[i], i};
                s.push(now);
        }
        return outp;
    }
}

// 30 38 30 36 35 40 28

// 30,0
// 38>30, count 1
// 0  = 1
// 38,1 
// 30, 2
// 36>30, count 1
// 2 = 1

// 38,1 36, 3 35, 4
// 40>35, count 1
// 4 = 1
// 40>36, count 2
// 3 = 2
// 40 > 38 count 4 (5-1)
// 1 = 4
// 40, 5 28, 6
// 5 = 0
// 6 = 0
// 1 4 1 2 1 0 0




