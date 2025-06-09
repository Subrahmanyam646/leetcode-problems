class Solution {
    public int findDivisor(int[] nums, int d) {
        int sum = 0;
        for(int i = 0; i < nums.length; i++) {
            sum += Math.ceil((double)nums[i]/(double)d);
        }
        return sum;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int maxi = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > maxi) maxi = nums[i];
        } 
        int low = 1, high = maxi;
        int ans = 0;
        while(low <= high) {
            int mid = low + (high - low)/2;
            int divisorSum = findDivisor(nums, mid);
            if(divisorSum <= threshold) {
                ans = mid;
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return ans;
    }
}