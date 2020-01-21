package ReverseInteger;

public class Main {
    public static int reverse(int x){
        int reversed = 0;
        int reminder = 0;

        while(x != 0){
            reminder = x % 10;
            x /= 10;

            if (reversed > Integer.MAX_VALUE || reversed == Integer.MAX_VALUE/10 && reminder > 7){
                return 0;
            }

            if (reversed < Integer.MIN_VALUE || reversed == Integer.MIN_VALUE/10 && reminder < -8){
                return 0;
            }

            reversed = reversed * 10 + reminder;

        }


        return reversed;
    }

    public static void main(String[] args) {
        System.out.println(reverse(-1234567890));
    }
}
