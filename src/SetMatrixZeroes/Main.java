package SetMatrixZeroes;

public class Main {
    public void setZeroes(int[][] matrix) {

        boolean firstColIsZero = false;
        int nrow = matrix.length;
        int ncol = matrix[0].length;

        for (int i = 0; i < nrow ; i++) {

            if(matrix[i][0] == 0){
                firstColIsZero = true;
            }

            for (int j = 1; j < ncol; j++) {
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        for (int i = 1; i < nrow; i++) {
            for (int j = 1; j < ncol ; j++) {
                if (matrix[0][j] == 0 || matrix[i][0] == 0){
                    matrix[i][j] = 0;
                }
            }
        }

        if(matrix[0][0] == 0){
            for (int j = 0; j < ncol; j++) {
                matrix[0][j] = 0;
            }
        }

        if(firstColIsZero){
            for (int i = 0; i < nrow; i++) {
                matrix[i][0] = 0;
            }
        }

    }
}
