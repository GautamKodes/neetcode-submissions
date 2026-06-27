class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> s  =  new Stack<>();
        int len = asteroids.length;
        int i = 0;
        s.push(asteroids[i]);
        i++;
        int count = 1;
        while (i<len){
            if (!s.isEmpty()){

            if (s.peek()>0 && asteroids[i] < 0){
                if ((asteroids[i]*-1) > s.peek()){
                    s.pop();
                    i--;
                } else if ((asteroids[i]*-1) == s.peek()){
                    s.pop();
                }
            } else {
                s.push(asteroids[i]);
            }
            }
             else {
                s.push(asteroids[i]);
            }
            i++;
        }

            Stack<Integer> rev = new Stack<>();
            while (!s.isEmpty()){
                rev.push(s.pop());
            }
            int[] temp = new int[rev.size()];
            int j = 0;
            while (!rev.isEmpty()){
                temp[j] = rev.pop();
                j++;
            }
            return temp;
    }
}