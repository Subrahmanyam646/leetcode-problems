class Solution {
    public int rob(int[] nums) {

        if(nums.length == 1) return nums[0];
        if(nums.length == 2) return Math.max(nums[0], nums[1]);

        int first = robLinear(nums, 0, nums.length - 2);
        int second = robLinear(nums, 1, nums.length -1);

        return Math.max(first, second);
    }

    public int robLinear(int[] nums, int start, int end){
        int prev = 0;
        int prev2 = nums[start];

        for(int i = start+1; i <= end; i++){
           int curr = Math.max(prev2, (prev + nums[i]));

            prev = prev2;
            prev2 = curr;
        }

        return prev2;
    }
}