class Solution {
    public int findLHS(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int num: nums){
            map.put(num,map.getOrDefault(num,0)+1);
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