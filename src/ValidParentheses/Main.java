package ValidParentheses;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(isValid("}]}()){{)[{[(]"));
    }
    public static boolean isValid(String s) {

        if(s.length() % 2 != 0){
            return false;
        }
        if(s.length() == 0 || s == null ){
            return true;
        }

        Character firstChar = s.charAt(0);
        if(firstChar == ')' || firstChar == ']' || firstChar == '}'){
            return false;
        }
        List<Character> container = new ArrayList<>();
        HashMap<Character, Character> table = new HashMap<>();
        table.put('{', '}');
        table.put('[', ']');
        table.put('(', ')');

        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            System.out.println(c);
            if (c == '{' || c == '(' || c == '['){
                container.add(c);
            } else {
                Character lastEle = container.get(container.size()-1);
                if (table.get(lastEle) == c){
                    container.remove(container.size()-1);
                }else{
                    return false;
                }
            }
        }

        if(container.size() != 0){
            return false;
        }

        return true;
    }
}
