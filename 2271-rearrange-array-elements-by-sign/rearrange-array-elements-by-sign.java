class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] pos = new int[nums.length/2];
        int[] neg = new int[nums.length/2];
        int i = 0;int j = 0;
        for(int num: nums){
            if(num > 0){
                pos[i++] = num;
            }else{
                neg[j++] = num;
            }
        }
        for(i = 0; i < pos.length; i++){
            nums[i*2] = pos[i];
            nums[i*2 + 1]=neg[i];
        }
        return nums;
    }
}