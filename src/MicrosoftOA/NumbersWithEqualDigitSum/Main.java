package MicrosoftOA.NumbersWithEqualDigitSum;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        int[] A = {51,32,43};
        System.out.println(maxSum(A));
    }

    public static int sumOfDigits(int a){
        a = Math.abs(a);
        int sum = 0;
        while(a > 0){
            sum += a % 10;
            a /= 10;
        }

        return sum;
    }

    public static int maxSum(int[] A){
        if(A.length <= 1) return -1;

        int res = -1;

        HashMap<Integer, Integer> map = new HashMap();
        for(int a : A){
            int sum = sumOfDigits(a);
            if(!map.containsKey(sum)){
                map.put(sum, a);
            }else{
                res = Math.max(res, map.get(sum) + a);
                map.put(a, Math.max(a, map.get(sum)));
            }

        }

        return res;
    }
}
