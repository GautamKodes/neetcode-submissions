class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> s = new Stack<>();
        int len = operations.length;
        int scores = 0;
        int score = 0;
        for (int i = 0; i<len; i++){
            if (operations[i].equals("C")){
                scores -= s.pop();
            } else if (operations[i].equals("D")){
                score = s.peek()*2;
                s.push(score);
                scores += score;
            } else if (operations[i].equals("+")){
                int temp = s.pop();
                score = temp + s.peek();
                s.push(temp);
                scores += score;
                s.push(score);
            } else {
                s.push(Integer.parseInt(operations[i]));
                scores += s.peek();

            }
        }
        return scores;
    }
}