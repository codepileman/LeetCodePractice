package PlusOne;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static int[] plusOne(int[] digits) {
        if(digits.length == 0){
            int[] ele = {1};
            return digits;
        }
        int carryon = 0;
        int[] output = new int[digits.length+1];

        for (int i = digits.length-1; i >= 0 ; i--) {
            int sum = i == digits.length-1 ? digits[i] + 1 + carryon : digits[i] + carryon;
            carryon = 0;
            if (sum >= 10){
                sum -= 10;
                carryon++;
            }

            digits[i] = sum;
            output[i+1] = sum;

            if(i == 0 && carryon == 1){
                output[0] = 1;
                return output;
            }
        }

        return digits;

    }
}
