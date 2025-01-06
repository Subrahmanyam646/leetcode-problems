class Solution {
    public int[] countBits(int n) {
        if(n == 0){
            return new int[n+1];
        }
        int[] ans = new int[n+1];
        ans[1] = 1;
        if(n == 1){
            return ans;
        }
        ans[2] = 1;
        for(int i = 3; i <= n; i++){
            if(i % 2 == 0){
                ans[i] = ans[i/2];
            }else{
                ans[i] = ans[i-1] + 1;
            }
        }
        return ans;
    }
}