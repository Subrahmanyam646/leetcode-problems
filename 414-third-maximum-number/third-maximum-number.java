class Solution {
    public int thirdMax(int[] nums) {
        Set<Integer> set = new HashSet<>();
        PriorityQueue<Integer> que = new PriorityQueue<>();

        for(int num: nums){
            if(set.add(num)){
                que.add(num);
                if(que.size() > 3){
                    que.poll();
                }
            }
        }

        if(que.size() == 3){
            return que.peek();
        }

        if(que.size() > 1){
            que.poll();
        }

        return que.peek();
    }
}