class Solution {
    public int findLHS(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int num: nums){
            if(map.containsKey(num)){
                map.put(num, map.get(num)+1);
            }else{
                map.put(num, 1);
            }
        }
        int out = 0;
        for (int num : map.keySet()) {
            int count = 0;
            if(map.containsKey(num+1)){
                count = map.get(num) + map.get(num+1);
            }
            out = Math.max(out,count);
        }

        return out;
    }
}