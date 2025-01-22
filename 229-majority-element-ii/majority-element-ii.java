class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;

        int cnt1 = 0, cnt2 = 0; 
        int el1 = Integer.MIN_VALUE; 
        int el2 = Integer.MIN_VALUE;

        for(int num: nums){
            if(cnt1 == 0 && el2 != num){
                cnt1++;
                el1=num;
            }else if(cnt2 == 0 && el1 != num){
                cnt2++;
                el2 = num;
            }else if(num == el1){
                cnt1++;
            }else if(num == el2){
                cnt2++;
            }else{
                cnt1--; cnt2--;
            }
        }
        cnt1 = cnt2= 0;
        for(int num: nums){
            if(num == el1){
                cnt1++;
            }else if(num ==el2){
                cnt2++;
            }
        }
        List<Integer> out = new ArrayList<>();
        int mini = (int)(n / 3) + 1;
        if (cnt1 >= mini) out.add(el1);
        if (cnt2 >= mini) out.add(el2);
        return out;
    }
}