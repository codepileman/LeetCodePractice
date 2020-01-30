package UniquePathII;

public class Main {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if(obstacleGrid[0][0] == 1){
            return 0;
        }
        int nrow = obstacleGrid.length;
        int ncol = obstacleGrid[0].length;

        obstacleGrid[0][0] = 1;
        for (int i = 1; i < ncol; i++) {
            obstacleGrid[0][i] = (obstacleGrid[0][i] == 0 && obstacleGrid[0][i-1] == 1) ? 1 : 0;
        }

        for (int i = 1; i < nrow; i++) {
            obstacleGrid[i][0] = (obstacleGrid[i][0] == 0 && obstacleGrid[i-1][0] == 1) ? 1 : 0;
        }

        for (int i = 1; i < nrow; i++) {
            for (int j = 1; j < ncol; j++) {
                if(obstacleGrid[i][j] == 0){
                    obstacleGrid[i][j] = obstacleGrid[i][j-1] + obstacleGrid[i-1][j];
                }else{
                    obstacleGrid[i][j] = 0;
                }

            }
        }

        return obstacleGrid[nrow-1][ncol-1];
    }
}
