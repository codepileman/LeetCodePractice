package WordSearch;

public class Main {
    public static void main(String[] args) {

    }
    public boolean exist(char[][] board, String word) {
        if(word == "" || board == null){
            return false;
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                boolean res = backtracking(i, j , board, word, 0, "");
                if(res){
                    return true;
                }
            }
        }

        return false;


    }

    private static boolean backtracking(int row, int col, char[][] board, String word, int index, String currentStr){
        if(currentStr.equals(word)){
            return true;
        }

        if(row < 0 || col < 0 || row >= board.length || col >= board[0].length || word.charAt(index) != word.charAt(index)){
            return false;
        }


        char temp = board[row][col];

        board[row][col] = ' ';

        currentStr += word.charAt(index);

        boolean found = backtracking(row+1, col, board, word, index+1, currentStr) ||

                backtracking(row, col+1, board, word, index+1, currentStr) ||

                backtracking(row-1, col, board, word, index+1, currentStr) ||

                backtracking(row, col-1, board, word, index+1, currentStr);

        board[row][col] = temp;
        return found;

    }
}
