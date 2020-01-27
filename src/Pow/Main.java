package Pow;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println(myPow(2.0000, 1000));
    }


    public static double myPow(double x, int n) {
        if(n == 0){
            return 1.0;
        }

        if(x == 0.0 || x == 1.0){
            return x;
        }

        HashMap<Integer, Double> table = new HashMap<>();
        if (n < 0){
            return 1.0 / pow(x, n, table);
        }

        return pow(x, n, table);

    }

    private static double pow(double x, int n, HashMap<Integer, Double> table){
        if(n == 1){
            return x;
        }

        if(n == 0){
            return 1;
        }

        if (table.containsKey(n)){
            return table.get(n);

        } else {
            double value = pow(x, n/2, table);
            double res;
            if(n % 2 == 0){
                res =  value * value;
            } else {
                res = value * value * x;
            }

            table.put(n, res);
            return res;
        }

    }

}
