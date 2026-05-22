class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<Integer, Boolean> visited = new HashMap<>();
        int len = strs.length;
        List<List<String>> anags = new ArrayList<>();
        if (len <2){
            anags.add(Arrays.asList(strs[0]));
        } else {

        for (int i=0; i<len; i++){
            if (visited.get(i) == null){

            // if (i+1==len){
            //     List<String> istr = new ArrayList<>();
            //     istr.add(strs[i]);
            //     anags.add(istr);
            // }
            List<String> istr = new ArrayList<>();
            istr.add(strs[i]);
            int ilen = strs[i].length();
            for (int j=i+1; j<len; j++){
                int jlen = strs[j].length();
                if (ilen == jlen){
                    char[] freq =new char[26];
                    for (int k=0; k<ilen; k++){
                    char inow = strs[i].charAt(k);
                    char jnow = strs[j].charAt(k);
                    freq[inow - 'a' ]++;
                    freq[jnow - 'a' ]--;
                    }
                    boolean checkanag = true;
                    for (int l = 0; l<26; l++){
                        if (freq[l] != 0){
                            checkanag = false;
                            break;
                        }
                    }
                    if (checkanag){
                        istr.add(strs[j]);
                        visited.put(j, true);
                    } 

                }
            }
            anags.add(istr);
            }
        }
        }
        return anags;
    }
}
