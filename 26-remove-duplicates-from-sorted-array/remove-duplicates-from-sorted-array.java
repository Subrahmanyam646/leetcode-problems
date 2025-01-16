class Solution {
    public int removeDuplicates(int[] nums) {
        int j = 1;
        int prev = nums[0];
        int n = nums.length;
        for(int i = 1; i < n; i++){
            if(prev != nums[i]){
                prev = nums[i];
                nums[j] = prev;
                j++;
            }
        }
        return j;
    }
}