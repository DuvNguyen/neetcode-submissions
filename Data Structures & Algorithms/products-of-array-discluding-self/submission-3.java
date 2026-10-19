class Solution {
    public int[] productExceptSelf(int[] nums) {
               // so for this, we're going to a technique called prefix, and suffix, the main
        // idea is to store the product
        // of the previous and the number after the i. And for the index. We will
        // iterate both side for two arrays
        // prefix we iterate from left to right

        int[] prefix = new int[nums.length];
        int[] suffix = new int[nums.length];

        //prefix
        prefix[0] = 1;
        for(int i = 1; i < nums.length; i++) {
            prefix[i] = prefix[i - 1] * nums[i - 1];
        }        



        int n = nums.length;
        suffix[n - 1] = 1;
        for(int i = n - 2; i >= 0; i--) {
            suffix[i] = suffix[i + 1] * nums[i + 1];
        }

        int[] out = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            out[i] = prefix[i] * suffix[i];
        }

        return out;
    }
}  
