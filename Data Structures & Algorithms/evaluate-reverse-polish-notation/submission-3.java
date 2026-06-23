class Solution {
    public int evalRPN(String[] tokens) {
        int len = tokens.length;

        if (len <3){
            return Integer.parseInt(tokens[0]);
        }
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i<len; i++){

            if (tokens[i].matches("-?\\d+")){
                s.push(Integer.parseInt(tokens[i]));
            } else if (tokens[i].equals("+")){
                int a = s.pop();
                int b = s.pop();
                int topush = a + b;
                s.push(topush);
            } else if (tokens[i].equals("-")){
                int a = s.pop();
                int b = s.pop();
                int topush = b-a;
                s.push(topush);
            } else if (tokens[i].equals("*")){
                int a = s.pop();
                int b = s.pop();
                int topush = b*a;
                s.push(topush);
            } else {
                int a = s.pop();
                int b = s.pop();
                int topush = b/a;
                s.push(topush);

            }



            // if (Character.isDigit(tokens.charAt(i))){
            //     s.push(Character.NurmericalValue(s.charAt(i)));
            // } else if (tokens.charAt(i) == '+'){
            //     int a = s.pop();
            //     int b = s.pop();
            //     s.push(a + b);
            // } else if (tokens.charAt(i) == '-'){
            //     int a = s.pop();
            //     int b = s.pop();
            //     s.push(a - b);
            // } else if (tokens.charAt(i) == '*'){
            //     int a = s.pop();
            //     int b = s.pop();
            //     s.push(a*b);
            // } else {
            //     int a = s.pop();
            //     int b = s.pop();
            //     s.push(a/b);
            // }
        }
        return s.pop();



    }
}
