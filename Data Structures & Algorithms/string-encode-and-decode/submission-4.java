class Solution {

    public String encode(List<String> strs) {
        int len = strs.size();
        String output = "#";
        if (len<=9){
                output = output + Integer.toString(len);
            } else {
                output = output + "#" + Integer.toString(len);
            }
        for (int i = 0; i<len; i++){
            String string = strs.get(i);
            int strlen = string.length();
            if (strlen<=9){
                output = output + "" + "#" + strlen + string;
            } else if (strlen >9 && strlen<100){
                output = output + "" + "##" + strlen + string;
            } else if (strlen>=100){
                output = output + "" + "###" + strlen + string;
            }
        }
        return output;
    }

    public List<String> decode(String str) {
        List<String> output = new ArrayList<>();
        int totallen = str.length();
        int added = 0;
        int i = 0;
        if (str.charAt(1) == '#'){
            int len = Integer.parseInt(str.substring(2, 4));
            i = 4;
        } else {
            int len = Character.getNumericValue(str.charAt(1));
            i = 2;
        }

        // String[] output = new String[len];
        while (i<totallen){
            if (str.charAt(i) == '#'){

                i++;
                if (str.charAt(i) == '#'){
                    i++;

                    if (str.charAt(i) == '#'){
                    i++;
                    int currlen = Integer.parseInt(str.substring(i, i+3));
                    i++;
                    i++;
                    i++;
                    String currstr = "";
                int count = 0;
                while (count<currlen){
                    currstr = currstr + str.charAt(i);
                    count++;
                    i++;
                }
                output.add(currstr);

                } else {

                    int currlen = Integer.parseInt(str.substring(i, i+2));
                    i++;
                    i++;
                    String currstr = "";
                int count = 0;
                while (count<currlen){
                    currstr = currstr + str.charAt(i);
                    count++;
                    i++;
                }
                output.add(currstr);
                }

                } else {
                int currlen = Character.getNumericValue(str.charAt(i));
                i++;
                String currstr = "";
                int count = 0;
                while (count<currlen){
                    currstr = currstr + str.charAt(i);
                    count++;
                    i++;
                }
                output.add(currstr);
                }
            } else {
                i++;
            }
        }
        return output;
    }
}
