package AddBinary;

public class Main {
    public static void main(String[] args) {
        System.out.println(addBinary("1111", "1111"));
    }
    public static String addBinary(String a, String b) {

        int carryon = 0;
        int length = a.length() > b.length() ? a.length() : b.length();
        String res = "";

        if (a.length() < length){
            int diff = length - a.length();
            while(diff > 0){
                a = "0" + a;
                diff--;
            }
        }

        if (b.length() < length){
            int diff = length - b.length();
            while(diff > 0){
                b = "0" + b;
                diff--;
            }
        }


        for (int i = length - 1; i >= 0 ; i--) {

            int c1 =  Character.getNumericValue(a.charAt(i));

            int c2 =  Character.getNumericValue(b.charAt(i));

            int sum = c1 + c2 + carryon;


            carryon = 0;
            if(sum >= 2){
                sum = sum - 2;
                carryon = 1;
            }

            res = Integer.toString(sum) + res;

        }

        if(carryon == 1){
            res = "1" + res;
        }

        return res;
    }
}
