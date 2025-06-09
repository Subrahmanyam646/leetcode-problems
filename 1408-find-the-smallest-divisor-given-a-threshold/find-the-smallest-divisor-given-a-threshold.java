class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        //int [] minMax = minMaxOfArray(nums);
        int low = 1;
        int high =  minMaxOfArray(nums);

        while(low < high){
            int mid = (low + high) / 2;
            int val = divideAllInArray(nums, mid);
            if(val > threshold){
                low = mid + 1;
            }else{
                high = mid;
            }
        } 
        return low;
    }
    public int divideAllInArray(int[] nums, int mid){
        int total = 0;
        for(int i = 0; i < nums.length; i++){
            total += Math.ceil((float)nums[i]/ mid);
        }
        return total;
    }

    public int minMaxOfArray(int[] nums){
        int max = nums[0];
        for(int i = 1; i< nums.length;i++){
            if(nums[i] > max){
                max = nums[i];
            }
        }
        return max;
    }
}