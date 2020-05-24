package WordBreak;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Main {
    public boolean wordBreak(String s, List<String> wordDict) {

        HashSet<String> wordSet = new HashSet<String>(wordDict);


        HashMap<String, Boolean> cache = new HashMap();

        return helper(s, wordSet, cache);

    }

    public boolean helper(String s, HashSet<String> wordSet, HashMap<String, Boolean> cache){
        if(cache.containsKey(s)) return cache.get(s);

        if(wordSet.contains(s)) return true;

        for(int i = 1; i < s.length(); i++){
            String left = s.substring(0, i);
            String right = s.substring(i, s.length());
            if(wordSet.contains(right) && helper(left, wordSet, cache)){
                cache.put(s, true);
                return true;
            }
        }

        cache.put(s, false);
        return false;


    }
}
