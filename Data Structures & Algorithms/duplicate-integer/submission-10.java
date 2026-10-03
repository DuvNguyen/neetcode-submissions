class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> seen = new HashMap<>();
        for(int num : nums) {
            seen.put(num, seen.getOrDefault(num, 0) + 1);
        }
        for(int freq : seen.values()) {
            if(freq > 1) {
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