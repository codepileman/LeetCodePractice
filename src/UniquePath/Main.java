package UniquePath;

public class Main {
    public static void main(String[] args) {
        System.out.println(uniquePaths(30, 30));
    }
//    public static int uniquePaths(int m, int n) {
////        if (m == 1 || n == 1) {
////            return 1;
////        }
////
////        int[][] table = new int[m][n];
////        for (int i = 0; i < m; i++) {
////            for (int j = 0; j < n; j++) {
////                table[i][j] = -1;
////            }
////
////        }
////
////        return helper(m-1, n-1, table);
////
////
////
////    }
////
////    private static int helper(int x, int y, int[][] table) {
////        if(x == 0 || y == 0) {
////            table[x][y] = 1;
////            return 1;
////        }
////
//////        if(table[x][y] != -1){
////////            return table[x][y];
////////        }
////
////        return helper(x - 1, y, table) + helper(x, y - 1, table);
////
////    }

    //super simple method using dp
    public static int uniquePaths(int m, int n) {
        int[][] grid = new int[m][n];
        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                if(i==0||j==0)
                    grid[i][j] = 1;
                else
                    grid[i][j] = grid[i][j-1] + grid[i-1][j];
            }
        }
        return grid[m-1][n-1];
    }
}
