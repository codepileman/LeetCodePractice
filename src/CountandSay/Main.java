package CountandSay;

public class Main {
    public static void main(String[] args) {
        System.out.println(countAndSay(30));
    }
    public static String countAndSay(int n) {
        if(n == 1) {
            return "1";
        }

        String seq = "1";
        for(int i = 2; i <= n; i++) {
            seq = getNext(seq);
        }

        return seq;


    }

    private static String getNext(String seq) {

        int i = 0;
        String res = "";
        while(i <= seq.length() - 1) {
            int counter = 1;
            int j = i;
            while(j <= seq.length() - 2 && seq.charAt(j) == seq.charAt(j+1)) {
                counter++;
                j++;
            }
            res += Integer.toString(counter) + seq.charAt(j);

            i = j + 1;

        }

        return res;
    }
}
