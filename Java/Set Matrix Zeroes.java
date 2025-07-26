class Solution {
    public void setZeroes(int[][] matrix) {

        boolean[] zeroRows = new boolean[matrix.length];
        boolean[] zeroCols = new boolean[matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    zeroRows[i] = true;
                    zeroCols[j] = true;
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            if (zeroRows[i]) {
                for (int j = 0; j < matrix[0].length; j++) {
                    matrix[i][j] = 0;
                }
            }
            else {
                for (int j = 0; j < matrix[0].length; j++) {
                    if (zeroCols[j]){
                        matrix[i][j] = 0;
                    }
                }
            }
        }
    }
}
