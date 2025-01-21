class Solution {
    public void setZeroes(int[][] matrix) {
        int col0 = 1; // Indicator for the first column
        int m = matrix.length;
        int n = matrix[0].length;

        // Step 1: Mark zeroes on the first row and column
        for (int i = 0; i < m; i++) {
            if (matrix[i][0] == 0) col0 = 0; // Mark if the first column should be zero
            for (int j = 1; j < n; j++) { // Start from 1 to avoid overwriting the first column
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0; // Mark the corresponding row
                    matrix[0][j] = 0; // Mark the corresponding column
                }
            }
        }

        // Step 2: Set zeroes based on marks (skip first row and column for now)
        for (int i = m - 1; i >= 0; i--) { // Process rows in reverse
            for (int j = n - 1; j >= 1; j--) { // Skip the first column
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
            if (col0 == 0) { // Handle the first column
                matrix[i][0] = 0;
            }
        }
    }
}
