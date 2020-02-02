package Search2DMatrixII;

public class Main {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 0 || matrix == null){
            return false;
        }
        //start from right upper corner
        int row = 0;
        int col = matrix[0].length - 1;
        while(row <= matrix.length - 1 && col >= 0){
            if(matrix[row][col] == target){
                return true;
            }

            if(matrix[row][col] < target){
                row++;
            }else{
                col--;
            }
        }

        return false;
    }
}
