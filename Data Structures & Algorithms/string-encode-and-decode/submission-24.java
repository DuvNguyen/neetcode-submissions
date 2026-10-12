class Solution {


public String encode(List<String> strs) {
       // we will store the String with the lengh and the devider which is a #
       // like this {hello, wold} -> 5#hello5#world
       // substring -> (i, j) -> from i to j - 1
        if(strs.isEmpty()) {
            return "";
        }

        StringBuilder encodedString = new StringBuilder();
        for(String s : strs) {
            encodedString.append(s.length()).append("<").append(s);
        }

        return encodedString.toString();
    }

    public List<String> decode(String str) {
        int i = 0;
        List<String> res = new ArrayList<>();
        while(i < str.length()) {
            int j = str.indexOf("<", i);
            int length = Integer.parseInt(str.substring(i, j));
            int start = j + 1;
            int end = start + length;
            res.add(str.substring(start, end));
            i = end;
        }

        return res;
    }
}
