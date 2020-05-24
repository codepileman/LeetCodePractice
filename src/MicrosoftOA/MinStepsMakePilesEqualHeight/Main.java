package MicrosoftOA.MinStepsMakePilesEqualHeight;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3};
        System.out.println(steps(arr));
    }

    public static int steps(int[] arr){
        int len = arr.length;
        Arrays.sort(arr);
        int res = 0;
        int distinctNum = 0;
        for(int i = 1; i < len; i++){
            if(arr[i] != arr[i-1]) {
                distinctNum++;
            }
            res += distinctNum;

        }

        return res;
    }
}
