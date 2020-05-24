package MicrosoftOA.LexicographicallySmallestString;

public class Main {
    public static void main(String[] args) {
        System.out.println(smallestString("abcdz"));
    }


    public static String smallestString(String s){
        StringBuilder sb = new StringBuilder(s);
        int i = 0;
        for(; i<s.length()-1;i++){
            if(s.charAt(i) > s.charAt(i+1)) break;
        }

        return sb.deleteCharAt(i).toString();
    }
}
