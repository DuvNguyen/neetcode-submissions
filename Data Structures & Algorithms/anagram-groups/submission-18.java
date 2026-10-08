class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagramBucket = new HashMap<>();

        for (String s : strs) {
            int[] count = new int[26];
            for (char c : s.toCharArray()) {
                count[c - 'a']++; // the index is its position in the alphabet calc by minus ascii chars
            }
            String keyPattern = Arrays.toString(count);
            anagramBucket.putIfAbsent(keyPattern, new ArrayList<>());
            anagramBucket.get(keyPattern).add(s);
        }

        return new ArrayList<>(anagramBucket.values());
    }  
}



/*
 the algorithm in java goes like this: 
 first,
    
    we have the freq arrays which is int[] count = new int[26]
    we also have the hashmap named map to store the key value: key is the String stands for the anagram pattern for that word, and the value is the anagrams

 loop: string s : strs
    loop: c : s.toCharArray
        count[c - 'a']++ // **count[...]: ... is the the index of the char, example a is 0 and b is 1** we ++ to track the freq of that character in the String s

        define the key: String key = count.toString;
        we put the key with a empty string list into the map if it has not been put

        get(key) -> value which is string -> add the S in


    at the end. return a new ArrayList which have the value of the map.

*/


/*
syntax note:

the function of Hashmap contains () at the end
for example: map.values()
*/