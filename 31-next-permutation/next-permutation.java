class Solution {
    public void nextPermutation(int[] nums) {
        int flag = -1;
        for(int i = nums.length - 2; i >= 0; i--){
            if(nums[i] < nums[i+1]){
                flag = i;
                break;
            }
        }
        if(flag == -1){
            reverse(nums,0);
            return;
        }
        for(int i = nums.length-1; i > flag; i--){
            if(nums[i] > nums[flag]){
                int temp = nums[flag];
                nums[flag] = nums[i];
                nums[i] = temp;
                break;
            }
        }
        reverse(nums, flag+1);
    }
    public int[] reverse(int [] nums, int start){
        int end = nums.length-1;
        while(start < end){
            int temp = nums[start];
            nums[start]  =nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
        return nums;
    }
}