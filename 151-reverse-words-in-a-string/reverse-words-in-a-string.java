class Solution {
    public String reverseWords(String s) {
        String [] words = s.trim().split(" ");
        StringBuffer ans = new StringBuffer();
        for(int i = words.length - 1; i >= 0; i--){
            if(words[i].trim().equals("")) continue;
            ans.append(words[i]);
            ans.append(' ');
        }
        return ans.toString().trim();
    }
}