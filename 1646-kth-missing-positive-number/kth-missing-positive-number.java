class Solution {
    public int findKthPositive(int[] arr, int k) {
        int i = 0;
        int j = 1;
        int prev = 1;
        int l = 0;
        while(l < k){
            if(i < arr.length && j == arr[i]){
                i++;
            }else{
                prev = j;
                l++;
            }
            j++;
        }
        return prev;
    }
}