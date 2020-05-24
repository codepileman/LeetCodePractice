package RepeatedSubstringPattern;

public class Main {
    public static void main(String[] args) {
        repeatedSubstringPattern("ababab");
    }
    public static boolean repeatedSubstringPattern(String s) {
        int len = s.length();
        for(int i = 0; i < len/2; i++){
            String substr = s.substring(0, i+1);
            System.out.println(substr);
            if(len % (i+1) != 0) continue;
            int repeatedTimes = len / (i + 1);
            System.out.println(repeatedTimes);
            String base = "";
            while(repeatedTimes > 0){
                base += substr;
                repeatedTimes--;
            }

            System.out.println(base);
            System.out.println("---------------");
            if(base.equals(s)) return true;
        }

        return false;

    }
}
