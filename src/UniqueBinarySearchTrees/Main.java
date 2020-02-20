package UniqueBinarySearchTrees;

public class Main {
    public static void main(String[] args) {
        System.out.println(numTrees(3));
    }
    public static int numTrees(int n) {
        //dynamic programming
        if(n < 1) return 0;
        int[] total = new int[n+1];
        total[0] = 1;
        total[1] = 1;

        for (int i = 2; i <= n ; i++) {
            for (int j = 0; j < i; j++) {
                total[i] += (total[i-j-1] * total[j]);
            }
        }

        return total[n];

    }
}
