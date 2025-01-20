class Solution {
    public int maxSubArray(int[] nums) {
        int out = Integer.MIN_VALUE;
        int max = 0;
        for(int i = 0; i < nums.length; i++){
            max = max +nums[i];
            if(max > out){
                out = max;
            }if(max < 0){
                max = 0;
            }
        }
        return out;
    }
}