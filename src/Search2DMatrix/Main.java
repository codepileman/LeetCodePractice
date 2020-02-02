package Search2DMatrix;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = new int[1][2];
        matrix[0] = new int[]{1, 3};
        System.out.println(searchMatrix(matrix, 2));
    }
    public static boolean searchMatrix(int[][] matrix, int target) {

        if(matrix.length == 0 || matrix[0].length == 0){
            return false;
        }

        int nrow = matrix.length;
        int ncol = matrix[0].length;

        if(target < matrix[0][0] || target > matrix[nrow-1][ncol-1] ){
            return false;
        }

        //use binary search
        int left = 0;
        int right = nrow * ncol - 1;

        while(left <= right){
            int mid = left + (right - left) / 2;
            int row = mid / ncol;
            int col = mid % ncol;
            System.out.println(row);
            System.out.println(col);
            if(matrix[row][col] == target){
                return true;
            }

            if(matrix[row][col] < target){
                left = mid + 1;
            }else{
                right = mid - 1;
            }

        }

        return false;



    }
}
