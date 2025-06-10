class Solution {
    public int splitArray(int[] nums, int k) {
        int low = Integer.MIN_VALUE;
        int high = 0;
        for(int i = 0; i < nums.length;i++){
            if(nums[i] > low){
                low = nums[i];
            }
            high += nums[i];
        }

        while(low <= high){
            int mid = (low + high) / 2;
            int part = findPartions(nums,mid);
            if(part > k){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return low;
    }
    public int findPartions(int [] nums, int mid){
        int part = 1;
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            if(sum > mid){
                part++;
                sum = nums[i];
            }
        }
        return part;
    }
}