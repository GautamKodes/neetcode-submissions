// class Solution {
//     public String simplifyPath(String path) {

//         // /..//_home/a/b/..///
//         // add /
//         // read .
//         // read prev not .
//         // continue
//         // read . 
//         // read prev .
//         // remove last = /
//         // read /
//         // add /
//         // while / 
//         // read _home
//         // add _home
//         // /_home
//         // read /
//         // while 
//         // add /
//         // /_home/a
//         // read /
//         // while /
//         // add /
//         // /_home/a/
//         // read b
//         // add b
//         // /_home/a/b/
//         // read .
//         // read  prev .
//         // remove b
//         // /_home/a/
//         // top=/
//         // remove top

        
//         int len = path.length();
//         Stack<String> s = new Stack<>();
//         int period_count = 0;
//         for (int i = 0; i<len; i++){
//             String now = Character.toString(path.charAt(i));
//             if (now.equals("/")){
//                 i++;
//                 while (path.charAt(i) == '/'){
//                     i++;
//                 }
//                 s.push("/");
//                 i--;
//             } else if (now.equals(".")){
//                 while (path.charAt(i)=='.'){
//                     period_count++;
//                     i++;
//                 }

//                 if (period_count == 2){
//                     while (s.pop() == "/"){
//                         continue;
//                     }
//                 } else if (period_count >2){
//                     s.push("...");
//                 }
//                 period_count = 0;
//                 i--;
//             } else {
//                 String dir_name = "";
//                 while (i<len && Character.toString(path.charAt(i)) != "/"){
//                     dir_name = dir_name + Character.toString(path.charAt(i));
//                     i++;
//                 }
//                 i--;
//                 s.push(dir_name);
//             }

//         }
//             String simplified = "";
//             while (!s.empty()){
//                 simplified = simplified + s.pop();
//             }
//             return simplified;




//     }
// }

class Solution {
    public String simplifyPath(String path) {
        Deque<String> stack = new LinkedList<>();
        for(String s: path.split("/")){
            if(s.equals("..") ) stack.poll();
            else if(!s.equals("") && !s.equals(".")) stack.push(s);
        }
        StringBuilder sb = new StringBuilder();
        if(stack.size() == 0) return "/";
        while(stack.size() != 0) sb.append("/").append(stack.pollLast());
        return sb.toString();
    }
}