class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;

        int prev = 0;
        int prev2 = 0;
        for(int i = 2;i <= n;i++){
            int curr = Math.min((prev+cost[i-1]),(prev2+cost[i-2]));
            prev2 = prev;
            prev = curr;
        }

        return prev;
    }
}