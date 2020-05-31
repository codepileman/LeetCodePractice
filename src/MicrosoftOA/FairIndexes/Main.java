package MicrosoftOA.FairIndexes;

public class Main {
    public static void main(String[] args) {
        int[] A = {2, -2, -3, 3};
        int[] B = {0, 0, 0, -4};
        System.out.println(solution(A, B));

    }

    public static int solution(int[] A, int[] B){
        int sumA = 0;
        int sumB = 0;
        for(int a : A){
            sumA += a;
        }

        for(int b : B){
            sumB += b;
        }

        int i = 0;
        int curAsum = 0;
        int curBsum = 0;
        while(i < A.length && i < B.length){
            curAsum += A[i];
            curBsum += B[i];
            if(sumA - curAsum == curAsum && sumB - curBsum == curBsum) return i;
            i++;
        }

        return 0;
    }
}
