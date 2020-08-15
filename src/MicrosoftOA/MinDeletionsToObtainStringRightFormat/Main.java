package MicrosoftOA.MinDeletionsToObtainStringRightFormat;

public class Main {

    public static void main(String[] args) {
        System.out.println(solution("BAAABAB"));
        System.out.println(solution("BBABAA"));
        System.out.println(solution("AABBBB"));
    }

    public static int solution(String S){

        //how many B's on the left of last A
        int countB = 0;
        int lastA = -1;
        for (int i = S.length() - 1; i >= 0; i--) {
            if(S.charAt(i) == 'A'){
                lastA = i;
                break;
            }
        }

        if(lastA != -1){
            for(int i=0; i<S.length(); i++){
                if(i < lastA && S.charAt(i) == 'B'){
                    countB++;
                }
            }
        }

        //how many A's on the right of the first B
        int countA = 0;
        int firstB = -1;
        for (int i = 0; i < S.length(); i++) {
            if(S.charAt(i) == 'B'){
                firstB = i;
                break;
            }
        }

        if(firstB != -1){
            for (int i = firstB; i < S.length(); i++) {
                if(S.charAt(i) == 'A'){
                    countA++;
                }
            }
        }

        return Math.min(countA, countB);


    }
}
