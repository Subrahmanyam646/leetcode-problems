class Solution {
    public int missingNumber(int[] nums) {
        int [] flag = new int[nums.length+1];

        for(int i =0; i < nums.length;i++){
            flag[nums[i]] = 1;
        }
        int i = 0;
        while(i < nums.length){
            if(flag[i] == 0){
                return i;
            }
            i++;
        }
        return i;

    }
}