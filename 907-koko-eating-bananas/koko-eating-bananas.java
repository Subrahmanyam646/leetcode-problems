class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        //Arrays.sort(piles);
        int low = 1;
        int high = maxOfPiles(piles);

        while(low <= high){
            int mid = (low + high) / 2;
            int works = findKoKoCanEat(piles, mid, h);
            if(works >= 0){
               high = mid - 1;
            }else if(works < 0){
                low = mid + 1;
            }
        }
        return low;
    }

    public int maxOfPiles(int[] piles){
        int max = piles[0];
        for(int i = 1; i < piles.length; i++){
            if(piles[i] > max){
                max = piles[i];
            }
        }
        return max;
    }
    public int findKoKoCanEat(int [] piles, int mid, int h){
        int total = 0;
        for(int i = 0; i < piles.length;i++){
            total += (int)Math.ceil((double)piles[i] / mid);
        }
        return h - total;
    }
}