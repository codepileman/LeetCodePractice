package RotateImage;

public class Main {
    public void rotate(int[][] matrix) {
        if(matrix == null){
            return;
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = i+1; j < matrix.length; j++) {
                swap(matrix, i, j, j, i);
            }
        }

        int left = 0;
        int right = matrix.length - 1;
        while(left < right){
            for (int row = 0; row < matrix.length; row++) {
                swap(matrix, row, left, row, right);
            }

            left++;
            right--;
        }

    }


    private static void swap(int[][] matrix, int i1, int j1, int i2, int j2){
        int temp = matrix[i1][j1];
        matrix[i1][j1] = matrix[i2][j2];
        matrix[i2][j2] = temp;
    }

}
