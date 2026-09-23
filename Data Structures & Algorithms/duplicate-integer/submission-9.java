class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> seen = new HashMap<>();

        for(int num : nums) {
            seen.put(num, seen.getOrDefault(num, 0) + 1);
        }

        for(int i : seen.values()) {
            if(i != 1) {
                return true;
            }
        }
        return false;
    }
}