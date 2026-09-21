class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // 1st step
        Map<Integer, Integer> seen = new HashMap<>();

        for(int num : nums) {
            seen.put(num, seen.getOrDefault(num, 0) + 1);
        }

        // 2nd step 
        List<Integer>[] buckets = new List[nums.length + 1];
        for(int key : seen.keySet()){
            int freq = seen.get(key);
            if(buckets[freq] == null) {
                buckets[freq] = new ArrayList<>();
            }
            buckets[freq].add(key);
        }

        // step 3
        int[] res = new int[k];
        int idx = 0;

        for(int i = nums.length; i >= 0; i--) {
            if(buckets[i] != null) {
                for(int num : buckets[i]) {
                    res[idx++] = num;
                    if(idx == k) return res;
                }
            }
        }

        return res;
    }
}


/*
    THREE STEPS:
    1. Get the seen Hashmap which contain key = num, value = num's frequency
    2. Get the buckets array of lists which looks like this: bucket[freq] = key. The size of the bucket is nums.lengh + 1. (cuz the array start from 0).
    3.get the res array by Inverse iterating the buckets (since buckets index count the frequency of the buckets[i]).

*/
