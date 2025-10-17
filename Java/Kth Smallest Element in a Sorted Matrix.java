class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int[] newArr = new int[matrix.length * matrix.length];
        int index=0;
        for (int i =0; i <matrix.length;i++){
            for (int j = 0 ; j< matrix.length;j++){
                newArr[index] = matrix [i][j];
                index++;
            }
        }
        Arrays.sort(newArr);
        return newArr [k-1];
    }
}
