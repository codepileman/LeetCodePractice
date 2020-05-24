package MicrosoftOA.MaxNetworkRank;

public class Main {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 3};
        int[] B = {2, 3, 1, 4};
        int N = 4;

        System.out.println("expected " + 4 + " actual " + maxRank(A, B, N));
    }

    public static int maxRank(int[] A, int[] B, int N){
        int max = 0;
        int len = A.length;
        int[] edges = new int[N+1];

        for(int i = 0; i<len; i++){
            edges[A[i]]++;
            edges[B[i]]++;
        }

        for(int i=0; i<len; i++){
            int numOfEdges = edges[A[i]] + edges[B[i]] - 1;
            max = Math.max(max, numOfEdges);
        }

        return max;
    }
}
