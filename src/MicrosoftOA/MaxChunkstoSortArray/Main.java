package MicrosoftOA.MaxChunkstoSortArray;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        int[] nums1 = {2,4,1,6,5,9,7};
        int[] nums2 = {4,3,2,6,1};
        int[] nums3 = {2,1,6,4,3,7};
        System.out.println(solve(nums1));
        System.out.println(solve(nums2));
        System.out.println(solve(nums3));
    }

    public static int solve(int[] nums){
        int res = 0;
        Set<Integer> copy = new HashSet<>();
        Set<Integer> ori =new HashSet<>();

        int[] copyArr = Arrays.copyOf(nums, nums.length);

        Arrays.sort(copyArr);

        for (int i = 0; i < nums.length; i++) {
            copy.add(copyArr[i]);
            ori.add(nums[i]);
            if(copy.equals(ori)){
                res++;
                copy = new HashSet<>();
                ori =new HashSet<>();
            }
        }



        return res;
    }
}
