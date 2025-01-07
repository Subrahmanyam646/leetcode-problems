class Solution {
    public int reverse(int x) {
        
        long rev = 0;
        boolean neg = false;
        if(x < 0){
            neg = true;
            x = Math.abs(x);
        }
        while(x > 0){
            rev = rev * 10 + (x%10);
            x = x / 10;
        }
        if(rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE){
            return 0;
        }
        if(neg){
            return -1* (int)rev;
        }
        return (int) rev;
    }
}