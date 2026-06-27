class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> s  =  new Stack<>();
        int len = asteroids.length;
        int i = 0;
        boolean positive = false;
        if (asteroids[0] > 0){ positive = true;
        } else {
            positive = false;
        }
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
                // if (s.peek() < 0){
                //     positive = false;
                // } else {
                //     positive  =  true;
                // }
            }
            }
             else {
                s.push(asteroids[i]);
                // if (s.peek() < 0){
                //     positive = false;
                // } else {
                //     positive  =  true;
                // }
            }
            i++;
        }
        System.out.println("Loop");

            Stack<Integer> rev = new Stack<>();
            while (!s.isEmpty()){
                rev.push(s.pop());
            }
            System.out.println("Loop");
            int[] temp = new int[rev.size()];
            // int[] temp = new int[len];
            // int[] temp = new int[s.size()];
            int j = 0;
            while (!rev.isEmpty()){
                temp[j] = rev.pop();
                j++;
            }
            System.out.println("Loop");
            return temp;
    }
}