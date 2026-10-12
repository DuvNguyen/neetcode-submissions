class Solution {
    public int[] productExceptSelf(int[] nums) {
               // so for this, we're going to a technique called prefix, and suffix, the main
        // idea is to store the product
        // of the previous and the number after the i. And for the index. We will
        // iterate both side for two arrays
        // prefix we iterate from left to right
        int[] suffix = new int[nums.length];
        int[] prefix = new int[nums.length];

        prefix[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            prefix[i] = prefix[i - 1] * nums[i - 1];
        }

        // the array with n element -> the length will be n -> meanwhile the index will
        // come from 0 -> n - 1
        // that's why we start from n - 2 not n - 1
        int n = nums.length;
        suffix[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            suffix[i] = suffix[i + 1] * nums[i + 1];
        }

        int[] out = new int[n];
        for (int i = 0; i < n; i++) {
            out[i] = prefix[i] * suffix[i];
        }

        return out;
    }
}  
