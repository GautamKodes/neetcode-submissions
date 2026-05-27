class Solution {
    public boolean isPalindrome(String s) {
        String target = s.toLowerCase();
        int len = target.length()-1;
        String ans = "";
        for(int i = 0; i<=len; i++){
            int ascii = (int) target.charAt(i);
                if (ascii >= 97 && ascii <=122){
                    ans += String.valueOf(target.charAt(i));
                } else if (ascii >= 48 && ascii <=57){
                    ans += String.valueOf(target.charAt(i));
                }
            }
    
        String rev = "";
        for (int i = ans.length()-1; i>=0;i--){
            rev += String.valueOf(ans.charAt(i));
        }
        return rev.equals(ans);
        }
    }