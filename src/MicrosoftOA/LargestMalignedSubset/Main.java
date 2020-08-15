package MicrosoftOA.LargestMalignedSubset;

public class Main {
    public static void main(String[] args) {
        int[] array = {-3, -2, 1, 0, 8, 7, 1};
        int a = solution(array, 3);
        System.out.println(a);
    }

    public static int solution(int[] A, int M){
        //if two num have the same reminder after dividing by m, then their difference can be divided by M.
        int result = 0;
        if (A == null || A.length == 0) return 0;

        int len = A.length;
        int[] moduleArr = new int[M];
        for(int num : A){
            int index = num < 0 ? (num % M + M) % M : num % M; //the way to find modulo for negative
            result = Math.max(++moduleArr[index], result);
        }

        return result;
    }
}

