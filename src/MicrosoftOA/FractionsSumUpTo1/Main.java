package MicrosoftOA.FractionsSumUpTo1;



import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int[] x1 = { 1, 1, 2 }, y1 = { 3, 2, 3 };
        int[] x2 = { 1, 1, 1 }, y2 = { 2, 2, 2 };
        int[] x3 = { 1, 2, 3, 1, 2, 12, 8, 4 }, y3 = { 5, 10, 15, 2, 4, 15, 10, 5 };
        System.out.println(solution(x1, y1));
        System.out.println(solution(x2, y2));
        System.out.println(solution(x3, y3));
    }

    public static int gcd(int x, int y){
        if(y == 0) return x;

        return gcd(y, x % y);
    }

    public static int solution(int[] X, int[] Y){
        if(X == null || Y == null) return 0;

        int len = Math.min(X.length, Y.length);

        int mod = (int) 1e9 + 7;

        Map<String, Integer> map = new HashMap<>();

        int res = 0;

        for(int i=0; i<len; i++){
            int p = X[i];
            int q = Y[i];

            int g = gcd(p, q);
            p = p / g;
            q = q / g;

            // fraction=p/q, we need (q-p)/q for the other term
            String key = Integer.toString(q-p) + "," + Integer.toString(q);
            if(map.containsKey(key)){
                res = (res + map.get(key)) % mod;
            }
            String key1 = Integer.toString(p) + "," + Integer.toString(q);
            map.put(key1, map.getOrDefault(key1, 0) + 1);
//            System.out.println(map.get(key1));
        }

        return res;


    }
}




