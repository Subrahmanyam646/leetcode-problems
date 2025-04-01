class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        set.add(n);
        int num = n;
        while(num != 1){
            int sumOfSquares = 0;
            while(num > 0){
                sumOfSquares = sumOfSquares + (int) Math.pow(num % 10, 2);
                num = num / 10;
            }
            if(!set.add(sumOfSquares)){
                return false;
            }
            num = sumOfSquares;
        }
        return true;
    }
}