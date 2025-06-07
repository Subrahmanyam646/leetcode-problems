class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if((long)m * k > bloomDay.length){
            return -1;
        }
        int low = 1;
        int high = maxDays(bloomDay);

        while(low <= high){
            int mid = (low + high) / 2;
            if(checkBoqueFormation(bloomDay, mid, m, k)){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return low;
    }
    public int maxDays(int[] bloomDay){
        int max = bloomDay[0];
        for(int i = 1; i < bloomDay.length; i++){
            if(bloomDay[i] > max){
                max = bloomDay[i];
            }
        }
        return max;
    }

   public boolean checkBoqueFormation(int[] bloomDay, int mid, int m, int k) {
    int totalB = 0;
    int count = 0;
    for (int i = 0; i < bloomDay.length; i++) {
        if (bloomDay[i] <= mid) {
            count++;
            if (count == k) {
                totalB++;
                count = 0; // reset after forming 1 bouquet
            }
        } else {
            count = 0;
        }
    }
        return totalB >= m;
    }
}