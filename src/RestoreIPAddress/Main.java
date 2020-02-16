package RestoreIPAddress;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String s = "010010";
        List<String> res = restoreIpAddresses(s);
        for (int i = 0; i < res.size(); i++) {
            System.out.println(res.get(i));
        }

    }
    public static List<String> restoreIpAddresses(String s) {

        List<String> res = new ArrayList<>();
        if(s.equals("") || s == null){
            return res;
        }
        backtracking(s, "", 0, 4, res);
        return res;

    }

    private static void backtracking(String s, String curString, int index, int remaining, List<String> res){
        if(remaining == 0){
            if(index == s.length()){
                res.add(curString);
            }
            return;
        }

        for (int i = 1; i <= 3; i++) {
            if(index + i > s.length()) break;
            if(i != 1 && s.charAt(index) == '0') break;
            String temp = s.substring(index, index + i);
            int value = Integer.valueOf(temp);
            if(value <= 255){
                backtracking(s, curString + temp + (remaining == 1 ? "" : "."), index + i, remaining - 1, res);
            }
        }
    }
}
