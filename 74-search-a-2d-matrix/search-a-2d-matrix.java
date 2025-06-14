class Solution {
    public boolean searchMatrix(int[][] matrix, int x) {
        int n = matrix.length;
        int m = matrix[0].length;
        for(int i = 0; i < n; i++){
            if(matrix[i][m-1] >= x && matrix[i][0]<=x){
                return binarySearch(matrix[i] , x, m);
            }
        }
        return false;

    }
    public boolean binarySearch(int [] arr,int x, int m){
        int low = 0;
        int high = m - 1;
        while(low <= high){
            int mid = (low + high)/2;
            if(arr[mid] == x){
                return true;
            }else if (arr[mid] > x){
                high = mid -1;
            }else{
                low = mid + 1;
            }
        }
        return false;
    }
}
