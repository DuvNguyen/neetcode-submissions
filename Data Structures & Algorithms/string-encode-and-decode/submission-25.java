class Solution {


public String encode(List<String> strs) {
       // we will store the String with the lengh and the devider which is a #
       // like this {hello, wold} -> 5#hello5#world
       // substring -> (i, j) -> from i to j - 1
        if(strs.isEmpty()) {
            return "";
        }

        StringBuilder res = new StringBuilder();
        for(String s : strs) {
            res.append(s.length()).append("#").append(s);
        }

        return res.toString();
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        
        int idx = 0;
        while (idx < str.length()) {
            int j = str.indexOf("#", idx);
            int start = j + 1;
            int length = Integer.parseInt(str.substring(idx, j));
            int end = start + length;
            res.add(str.substring(start, end));
            idx = end;
        }

        return res;
    }
}
