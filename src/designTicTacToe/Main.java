package designTicTacToe;

public class Main {

    int[] rowCounter;
    int[] colCounter;
    int diagLeft;
    int diagRight;
    int n;

    public void main(String[] args) {
        //https://www.youtube.com/watch?v=_BDXk5mkxzQ
        rowCounter = new int[n];
        colCounter = new int[n];
        diagLeft = 0;
        diagRight = 0;
        this.n = n;
    }


    public int move(int row, int col, int player){
        int move = player == 1? 1 : -1;
        rowCounter[row] += move;
        colCounter[col] += move;
        if(row == col) diagLeft += move;
        if(row == n - col - 1) diagRight += move;
        if(rowCounter[row] == n || colCounter[col] == n || diagLeft == n || diagRight == n){
            return 1;
        }else if(rowCounter[row] == -n || colCounter[col] == -n || diagLeft == -n || diagRight == -n){
            return 2;
        }else{
            return 0;
        }

    }
}
