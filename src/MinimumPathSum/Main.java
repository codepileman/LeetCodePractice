package MinimumPathSum;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Main {
    public static void main(String[] args) {
        int[][] grid = {{9,1,4,8}};
        minPathSum(grid);

    }


    public static int minPathSum(int[][] grid) {
        if(grid.length == 0 || grid == null){
            return 0;
        }


        int nrow = grid.length;
        int ncol = grid[0].length;

        for (int i = 1; i < nrow; i++) {
            grid[i][0] += grid[i-1][0];
        }

        for (int i = 1; i < ncol; i++) {
            grid[0][i] += grid[0][i-1];
        }

        for (int i = 1; i < nrow; i++) {
            for (int j = 1; j < ncol; j++) {
                grid[i][j] += grid[i-1][j] > grid[i][j-1] ? grid[i][j-1] : grid[i-1][j];
            }
        }

        return grid[nrow-1][ncol-1];

    }
}
