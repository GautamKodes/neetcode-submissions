class Solution {
    public boolean isValid(String s) {
        int len = s.length()-1;
        Stack <String> stack = new Stack<>();
        if (len ==0){
            return false;
        } else if (len%2 !=0){
        for (int i=0; i<=len; i++){
            String now = Character.toString(s.charAt(i));
            if (now.equals(")")){
                if (stack.empty() || !stack.pop().equals("(")){
                return false;
                }
            } else if (now.equals("]")) {
                if (stack.empty() || !stack.pop().equals("[")){
                return false;
                }
            } else if (now.equals("}")){
                if (stack.empty() || !stack.pop().equals("{")){
                return false;
                }
            } else {
                if (i==len){
                    return false;
                }
                stack.push(now);
            }
        }
        } else{
            return false;
        }
        if (stack.empty()){
            return true;
        }
        return false;
    }
}