class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0; i < weights.length; i++){
            if(max < weights[i]){
                max = weights[i];
            }
            sum += weights[i];
        }

        int low = max;
        int high = sum;
        while(low <= high){
            int mid = (low + high) / 2;
            int day = findDays(weights, mid);
            int numberOfDays = findDays(weights, mid);
            if (numberOfDays <= days) {
                //eliminate right half
                high = mid - 1;
            } else {
                //eliminate left half
                low = mid + 1;
            }
        }
        return low;
    }
    public static int findDays(int[] weights, int cap) {
        int days = 1; //First day.
        int load = 0;
        int n = weights.length; //size of array.
        for (int i = 0; i < n; i++) {
            if (load + weights[i] > cap) {
                days += 1; //move to next day
                load = weights[i]; //load the weight.
            } else {
                //load the weight on the same day.
                load += weights[i];
            }
        }
        return days;
    }
}