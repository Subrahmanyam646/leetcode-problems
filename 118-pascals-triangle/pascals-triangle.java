class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> out = new ArrayList<>();
        for(int i = 1; i <= numRows; i++){
            List<Integer> line = new ArrayList<>();
            for(int j = 1; j <= i; j++){
                if(j == 1 || i == j){
                    line.add(1);
                }else{
                    List<Integer> temp = out.get(i-2);
                    line.add(temp.get(j-1)+temp.get(j-2));
                }
            }
            out.add(line);
        }
        return out;

    }
}