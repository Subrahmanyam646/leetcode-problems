class Solution {
    public double myPow(double x, int n) {
        if(n == 0){
            return 1;
        }long exp = n;

        if (exp < 0) {
            x = 1 / x;
            exp = -exp; 
        }

        double half = myPow(x, (int)(exp / 2)); 
        if (exp % 2 == 0) {
            return half * half; 
        } else {
            return half * half * x; 
        }
    }
}