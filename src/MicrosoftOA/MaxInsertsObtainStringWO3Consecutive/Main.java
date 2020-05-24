package MicrosoftOA.MaxInsertsObtainStringWO3Consecutive;

public class Main {
    public static void main(String[] args) {
        //https://leetcode.com/discuss/interview-question/398056/
        System.out.println(maxInsert("aabab"));
        System.out.println(maxInsert("dog"));
        System.out.println(maxInsert("aa"));
        System.out.println(maxInsert("baaa"));

    }

    public static int maxInsert(String s){
        //对于a字符，count-1，如果count小于0，说明有三个连续的a，return -1
        //对于每个非a的字符，只考虑这个字符左边的情况，因为它的右边是下一个字符的左边。loop结束以后，再考虑最后一个字符的右边
        int res = 0;
        int count = 2;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'a'){
                count--;
                if(count < 0) return -1;
            }else{
//                if(count < 0) return -1;
                res += count;
                count = 2;
            }
        }

        return res + count;


    }
}
