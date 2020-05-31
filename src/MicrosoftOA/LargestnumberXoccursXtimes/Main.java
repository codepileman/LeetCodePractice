package MicrosoftOA.LargestnumberXoccursXtimes;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] A1 = {3,8,2,3,3,2};
        int[] A2 = {7,1,2,8,2};
        int[] A3 = {3,1,4,1,5};
        int[] A4 = {5,5,5,5,5};
        System.out.println(solution(A1));
        System.out.println(solution(A2));
        System.out.println(solution(A3));
        System.out.println(solution(A4));

    }

    public static int solution(int[] A){
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int a : A){
            map.put(a, map.getOrDefault(a, 0) + 1);
        }

        int res = 0;
        for(Integer key : map.keySet()){
            if(key == map.get(key) && key > res){
                res = key;
            }
        }


        return res;
    }
}
