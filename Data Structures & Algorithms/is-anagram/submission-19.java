class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sArray = s.toCharArray();
        Arrays.sort(sArray);

        char[] tArray = t.toCharArray();
        Arrays.sort(tArray);

        if(sArray.length != tArray.length) {
            return false;
        }

        if(Arrays.equals(tArray, sArray)){
            return true;
        }

        return false;
    }
}

/*
- String -> to char array
- sort aphabetically
- check if samelength -> consider ana
    if not: not ana
- for (same -> count++):
    = count -> ana
    != count -> not ana
*/