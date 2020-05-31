package MicrosoftOA.WidestPathWithoutTrees;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println();
    }

    public static int maxWidth(int[] x){
        Arrays.sort(x);
        int max = 0;
        for(int i=1; i<x.length; i++){
            max= Math.max(max, x[i]-x[i-1]);
        }

        return max;
    }
}
