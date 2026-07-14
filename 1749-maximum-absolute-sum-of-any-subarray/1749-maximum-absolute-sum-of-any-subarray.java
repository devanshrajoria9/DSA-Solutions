class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int max_bestending = nums[0];
        int min_bestending = nums[0];
        int ans = Math.abs(nums[0]);

        for(int i=1; i<nums.length; i++){
            int max_v1 = max_bestending + nums[i];
            int max_v2 = nums[i];

            int min_v1 = min_bestending + nums[i];
            int min_v2 = nums[i];

            max_bestending = Math.max(max_v1, max_v2);
            min_bestending = Math.min(min_v1, min_v2);

            ans = Math.max(ans, Math.abs(max_bestending));
            ans = Math.max(ans, Math.abs(min_bestending));
        }
        return ans;
    }
}