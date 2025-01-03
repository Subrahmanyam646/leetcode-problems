class Solution {
    public int rob(int[] nums) {
        if(nums.length == 1) return nums[0];
        if(nums.length == 2) return Math.max(nums[0], nums[1]);

        int prev = 0;
        int prev2 = nums[0];
        for(int i = 1; i < nums.length; i++){
            int curr = Math.max(prev2, (prev + nums[i]));

            prev = prev2;
            prev2 = curr;
        }
        return prev2;
    }
}