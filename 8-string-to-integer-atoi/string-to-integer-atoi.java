// class Solution {
//     public int myAtoi(String s) {
//         long ans = 0;
//         s = s.trim();
//         int n = s.length();
//         boolean minus = false;
//         for(int i = 0; i <n; i++){
//             if(i == 0 && s.charAt(i) == '-' ){
//                 //System.out.print("Yes");
//                 minus = true;
//                 continue;
//             }try{
//                 int temp = Integer.parseInt(s.charAt(i)+"");
//                 System.out.println(temp);
//                 if(ans == 0 && temp == 0){
//                     continue;
//                 }
//                 ans = ans * 10 + temp;
//             }catch(Exception e){
//                 break;
//             }
//         }
//         if(minus) ans= -1 * ans;
//         if(ans > Integer.MAX_VALUE) return Integer.MAX_VALUE;
//         return (int)ans;
//     }
// }
class Solution {
    public static int helpher(String s1,int left,int sum,int sign){
        if(left>=s1.length() || !(Character.isDigit(s1.charAt(left)))){
            return sum*sign;
        }
        int digit=s1.charAt(left)-'0';
        if (sum > (Integer.MAX_VALUE - digit) / 10) {
            return (sign==1)?Integer.MAX_VALUE:Integer.MIN_VALUE;
        }
        sum=sum*10+(s1.charAt(left)-'0');
        return helpher(s1,left+1,sum,sign);
    }
    public int myAtoi(String s) {
        String s1=s.trim();
        if(s1.isEmpty()) return 0;
        int sign=1;
        int left=0;
        if(s1.charAt(0)=='-'){
            sign=-1;
            left=1;
        }
        else if(s1.charAt(0)=='+'){
            left=1;
        }
        int ans=helpher(s1,left,0,sign);
        return ans;
    }
}