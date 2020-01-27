package GroupAnagrams;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> res = groupAnagrams(input);
        for(List<String> items : res){
            for(String item: items){
                System.out.println(item);
            }
            System.out.println("--------------");
        }
    }
    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        List<String> sortedString = new ArrayList<>();
        HashMap<String, List<Integer>> table = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            sortedString.add(sortString(strs[i]));
        }

        for (int i = 0; i < sortedString.size(); i++) {
            if(!table.containsKey(sortedString.get(i))){
                List<Integer> index = new ArrayList<>();
                index.add(i);
                table.put(sortedString.get(i), index);
            }else{
                table.get(sortedString.get(i)).add(i);
            }
        }

        for(Map.Entry ele : table.entrySet()){
            List<Integer> values = (ArrayList) ele.getValue();
            List<String> temp = new ArrayList<>();
            for(int value : values){
                temp.add(strs[value]);
            }

            res.add(temp);
        }

        return res;

    }

    private static String sortString(String input){
        char[] tempArray = input.toCharArray();
        Arrays.sort(tempArray);
        return new String(tempArray);
    }
}
