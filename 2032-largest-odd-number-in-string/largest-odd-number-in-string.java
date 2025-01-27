class Solution {
    public String largestOddNumber(String num) {
        int index = num.length()-1;
        while(index >= 0){
            int c = Integer.parseInt(num.charAt(index)+"");
            if(c % 2 == 1){
                return num.substring(0,index+1);
            }
            index--;
        }
        return "";
    }
}