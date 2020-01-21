package GenerateParentheses;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(generateParenthesis(4));
    }
    public static List<String> generateParenthesis(int n) {
        List<String> output = new ArrayList<>();
        int max = n;
        backtracking(output, "", max, 0, 0);
        return output;
    }

    public static void backtracking(List<String> output, String s, int max, int open, int close){
        if (close == max){
            output.add(s);
        }

        if(open < max) backtracking(output, s+"(", max, open+1, close);
        if(close < open) backtracking(output, s+")", max, open, close+1);
    }

}
