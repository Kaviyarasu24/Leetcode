class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] outnums = new int[n];
        
        // Step 1: Build prefix product
        outnums[0] = 1;
        for (int i = 1; i < n; i++) {
            outnums[i] = outnums[i - 1] * nums[i - 1];
        }

        // Step 2: Multiply with suffix product
        int suffix = 1;
        for (int i = n - 1; i >= 0; i--) {
            outnums[i] *= suffix;
            suffix *= nums[i];
        }

        return outnums;
    }
}
