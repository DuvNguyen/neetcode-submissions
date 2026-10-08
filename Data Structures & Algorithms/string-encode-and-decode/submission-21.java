class Solution {


public String encode(List<String> strs) {
        if (strs.isEmpty()) {
            return "";
        }

        StringBuilder res = new StringBuilder();
        for(String str : strs) {
            res.append(str.length()).append("#").append(str);
        }

        return res.toString();
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>(); // 5#hello5#world
        int i = 0;
        while (i < str.length()) {
            int j = str.indexOf("#", i);
            int length = Integer.parseInt(str.substring(i, j));
            int start = j + 1;
            int end = start + length;
            res.add(str.substring(start, end));
            i = end;
        }

        return res;
    }
}
