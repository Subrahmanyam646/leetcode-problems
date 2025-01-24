class Solution {
    public int searchInsert(int[] nums, int target) {
        int first = 0;
        int last = nums.length - 1;
        int ans = nums.length; 

        while (first <= last) {
            int mid = first + (last - first) / 2; 
            if (nums[mid] >= target) {
                ans = mid; 
                last = mid - 1;
            } else {
                first = mid + 1; 
            }
        }

        return ans;
    }
}