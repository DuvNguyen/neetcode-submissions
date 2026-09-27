class Solution {
    public int[] topKFrequent(int[] nums, int k) {
      /*
     * 
     * seen Map -> get the hashmap to store the key and the freq of them
     * bucket store the key at the index match the freq
     * iterate backwards to get the element to the res array which is the int[]
     */

    Map<Integer, Integer> seen = new HashMap<>();
    for (int num : nums) {
      seen.put(num, seen.getOrDefault(num, 0) + 1);
    }

    int max = nums.length;
    List<Integer>[] buckets = new List[max + 1];
    for (int key : seen.keySet()) {
      int freq = seen.get(key);
      if (buckets[freq] == null) {
        buckets[freq] = new ArrayList<>();
      }
      buckets[freq].add(key);
    }

    int idx = 0;
    int[] res = new int[k];
    for (int i = max; i >= 0; i--) {
      if (buckets[i] != null) {
        for (int num : buckets[i]) {
          res[idx++] = num;
          if (idx == k) {
            return res;
          }
        }
      }
    }

    return new int[] {};
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