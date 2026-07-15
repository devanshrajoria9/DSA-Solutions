class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int Max_bestending = nums[0];
        int Min_bestending = nums[0];
        int Max_ans = nums[0];
        int Min_ans = nums[0];
        int cir_Max = nums[0];
        int totalSum = nums[0];

        for (int i = 1; i < nums.length; i++) {

            // if any Straight max subarray Find Max subarray--
            int Max_v1 = Max_bestending + nums[i];
            int Max_v2 = nums[i];
            Max_bestending = Math.max(Max_v1, Max_v2);
            Max_ans = Math.max(Max_ans, Max_bestending);

            // Find minimum for find circular max subarray--
            int Min_v1 = Min_bestending + nums[i];
            int Min_v2 = nums[i];
            Min_bestending = Math.min(Min_v1, Min_v2);
            Min_ans = Math.min(Min_ans, Min_bestending);

            totalSum = totalSum + nums[i];
        }
        //If All element are negative the retutn Max_ans---
        if (Max_ans < 0) {
            return Max_ans;
        }
        // Now circular----
        cir_Max = (totalSum - Min_ans);

        return Math.max(Max_ans, cir_Max);
    }
}