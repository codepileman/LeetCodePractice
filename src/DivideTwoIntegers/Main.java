package DivideTwoIntegers;

public class Main {
    public static void main(String[] args) {
        System.out.println(divide(-2147483648,-1));

    }

    public static int divide(int dividend, int divisor) {
        if(dividend == 0 || divisor == 1){
            return dividend;
        }

        if(dividend < divisor){
            return 0;
        }
        boolean negative = (dividend < 0) ^ (divisor < 0);

        long d1 = Math.abs((long)dividend);
        long d2 = Math.abs((long)divisor);
        System.out.println(d1);
        System.out.println(d2);

        d1 -= d2;
        long quotient = 0;
        while(d1 >= 0){
            d1 -= d2;
            quotient++;
        }


        long res = negative ? quotient*-1 : quotient;
        return (int) res;


    }

}
