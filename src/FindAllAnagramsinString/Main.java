package FindAllAnagramsinString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String s =  "cbeabccbaabccbaabccbaabccbaabccbaabccba";
        String p = "abc";

        List<Integer> res = findAnagrams(s, p);
        for(int re : res){
            System.out.println(re);
        }
    }

    public static List<Integer> findAnagrams(String s, String p) {
        //www.youtube.com/watch?v=brHksboh9hw
        List<Integer> res = new ArrayList();

        if(s.length() < p.length()) return res;

        HashMap<Character, Integer> map = new HashMap();

        for(char c : p.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int left = 0;
        int right = 0;
        int counter = map.size();


        while(right < s.length()){
            char c = s.charAt(right);

            if(map.containsKey(c)){
                map.put(c, map.get(c) - 1);
                if(map.get(c) == 0){
                    counter--;
                }

                System.out.println(right) ;
                System.out.println(c + " : " + map.get(c) + " counter : " +  counter);

                System.out.println("-------------");
            }

            right++;

            while(counter == 0){
                char cc = s.charAt(left);
                if(map.containsKey(cc)){
                    map.put(cc, map.get(cc) + 1);
                    if(map.get(cc) > 0) counter++;
                }


                if(right - left == p.length()) res.add(left);

                left++;
            }


        }

        return res;

    }

}
