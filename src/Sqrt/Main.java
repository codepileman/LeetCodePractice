package Sqrt;

public class Main {
    public static void main(String[] args) {
        System.out.println(mySqrt(2147395599));
    }

    public static int mySqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }

        long start = 1;
        long end = x;
        long res = 0;

        while (start <= end) {
            long mid = start + (end - start) / 2;
            if (mid * mid == x || (mid * mid < x && (mid + 1) * (mid + 1) > x)) {
                return (int) mid;
            }

            if (mid * mid > x) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return (int) res;


    }

}
//        return helper(x, 0, x);

//    }
    //if input int is big, it will cause stack overflow.
//    private static int helper(int x, int start, int end){
//        int mid = start + (end - start) / 2;
//        if(mid * mid == x || (mid * mid < x && (mid + 1) * (mid + 1) > x)){
//            return mid;
//        }
//
//        if(mid * mid < x){
//            start = mid + 1;
//            return helper(x, start, end);
//        }else {
//            end = mid - 1;
//            return helper(x, start, end);
//        }
//
//
//    }

