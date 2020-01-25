package MultiplyStrings;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(multiply("434643431311", "46543"));
    }
    public static String multiply(String num1, String num2) {
        if(num1.equals("0") || num2.equals("0")) {
            return "0";
        }

        String finalStr = "";

        int[] res = new int[num1.length() + num2.length()];
        Arrays.fill(res, 0);

        int numberOfZero = 0;

        for(int i = num2.length() - 1; i >= 0 ; i--) {

            int c1 = Character.getNumericValue(num2.charAt(i));

            int carriedOn = 0;

            int j = num1.length() - 1;

            int start = res.length - 1 - numberOfZero;

            while(j >= 0) {

                int c2 = Character.getNumericValue(num1.charAt(j));
                int times = c1*c2 + carriedOn;
                int singleDigit = times % 10;
                if (res[start] + singleDigit >= 10) {
                    res[start] = res[start] + singleDigit - 10;
                    res[start - 1] += 1;

                }else{
                    res[start] = res[start] + singleDigit;
                }
                carriedOn = times / 10;

                if(j==0 && carriedOn > 0){
                    res[start - 1] += carriedOn;
                }

                j--;
                start--;

            }
            numberOfZero++;


        }


        if(res[0] != 0) {
            finalStr += (char) (res[0] + '0');
        }

        for(int i = 1; i< res.length; i++) {
            finalStr += (char) (res[i] + '0');
        }

        return finalStr;
    }
}
