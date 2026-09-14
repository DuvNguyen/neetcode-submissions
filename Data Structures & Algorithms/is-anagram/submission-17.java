class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sArray = s.toCharArray();
        Arrays.sort(sArray);

        char[] tArray = t.toCharArray();
        Arrays.sort(tArray);

        int countSame = 0;

        if (!sameLength(sArray, tArray)) {
            return false;
        }

        for (int i = 0; i < sArray.length; i++) {
            if (sArray[i] == tArray[i]) {
                countSame++;
            }
            if (countSame == sArray.length){
                return true;
            }
        }
        return false;
    }

    public boolean sameLength(char[] array1, char[] array2){
        if (array1.length > array2.length || array1.length < array2.length) {
            return false;
        } else {
            return true;
        }
    }
}

/*
- String -> to char array
- sort aphabetically
- for (same -> count++):
    = count -> ana
    != count -> not ana
*/