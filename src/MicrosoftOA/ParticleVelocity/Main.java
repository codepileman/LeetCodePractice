package MicrosoftOA.ParticleVelocity;

public class Main {
    public static void main(String[] args) {
        int[] A = {-1, 1, 3, 3, 3, 2, 3, 2, 1, 0};
        int[] B = {1,3,5,7,9};
        int[] C = {7,7,7,7};
        int[] D = {3,-1,-5,-9};
        System.out.println(solution(A));
        System.out.println(solution(B));
        System.out.println(solution(C));
        System.out.println(solution(D));
    }

    public static int solution(int[] A){
        if(A.length < 3) return 0;
        int index = 2;
        int len = 0;
        while(index < A.length){
            if(A[index] - A[index-1] ==  A[index-1] - A[index-2]){
                len++;
                while(index < A.length && A[index] - A[index-1] ==  A[index-1] - A[index-2]){
                    index++;
                }
            }else{
                index++;
            }

        }

        return len;
    }
}
