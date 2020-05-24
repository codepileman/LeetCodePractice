package MicrosoftOA.MinMovestoObtainStringWithout3IdenticalConsecutiveLetters;

public class Main {

    public static void main(String[] args) {
        //https://leetcode.com/discuss/interview-question/398026/
        //这题有个简单的解法，只要count多少个连续的相同数字，用count/3就可以了，至于change哪个字母不重要
        System.out.println(minMove("aaaaaaaa"));
    }

    public static int minMove(String s){
        int moves = 0;
        for(int i = 0; i < s.length(); i++){
            int len = 1;
            while(i + 1 < s.length() && s.charAt(i) == s.charAt(i+1)){
                len++;
                i++;
            }

            moves += len / 3;
        }

        return moves;
    }
}
