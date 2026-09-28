class Solution {
    public int[] productExceptSelf(int[] nums) {
    int[] output = new int[nums.length];
        int product = 1;

        int count0 = 0;
        for (int num : nums) {
            if (num == 0) {
                count0++;
                if (count0 > 1) {
                    return new int[nums.length];
                }
                continue;
            }
            product = product * num;
        }

        for (int i = 0; i < output.length; i++) {
            if (count0 == 1 && nums[i] != 0) {
                output[i] = 0;
                continue;
            }

            if (nums[i] == 0 && count0 == 1) {
                output[i] = product;
                continue;
            }

            output[i] = product / nums[i];
        }

        return output;    
    }
}  
