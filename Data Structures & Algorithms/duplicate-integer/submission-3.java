class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();


        for (int i = 0; i < nums.length; i++) {
            int currentNumCount = freq.getOrDefault(nums[i], 0) + 1;
            freq.put(nums[i], currentNumCount);
            if (currentNumCount > 1) {
                return true;
            }
        }

        return false;
    }
}

/*
- loop array:
    getOrFaule get freg
    if value > 1 then return true

- return false
*/