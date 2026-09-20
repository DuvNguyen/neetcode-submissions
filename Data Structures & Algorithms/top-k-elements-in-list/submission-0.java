class Solution {
    public int[] topKFrequent(int[] nums, int k) {
    Map<Integer, Integer> seen = new HashMap<>();

        for (int num : nums) {
            seen.put(num, seen.getOrDefault(num, 0) + 1);
        }

        int[] freq = new int[seen.size()];
        int i = 0;
        for (int key : seen.keySet()) {
            freq[i] = key;
            i++;
        }

        int temp;
        for (int x = 0; x < freq.length; x++) {
            for (int y = x + 1; y < freq.length; y++) {
                if (seen.get(freq[x]) < seen.get(freq[y])) {
                    temp = freq[x];
                    freq[x] = freq[y];
                    freq[y] = temp;
                }
            }
        }

        int[] res = new int[k];

        for (int x = 0; x < k; x++) {
            res[x] = freq[x];
        }

        return res;
    }
}


/*

get the k numbers that appears most in the nums

-> sorting from hightest to lowest

output: the numbers not the frequency

hashmap:
    key: number
    value: frequency



*/