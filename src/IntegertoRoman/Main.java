package IntegertoRoman;

public class Main {

    public static void main(String[] args) {
        System.out.println(intToRoman(9));
    }
    public static  String intToRoman(int num) {

        String res = "";
        int[] list = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
        String[] roman = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};

        for (int i = list.length-1; i >= 0; i--) {
            while(num >= list[i]){
                num -= list[i];
                res += roman[i];
            }
        }

        return res;

    }
}
