package ValidSudoku;

import java.util.HashSet;

public class Main {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> table = new HashSet<>();

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char c = board[i][j];
                if(c != '.'){
                    if(!table.add(c + "in row" + i)
                        || !table.add(c + "in col" + j)
                        || !table.add(c + "box " + i/3 + j/3)){
                        return false;
                    }
                }
            }
        }

        return true;
    }
}
