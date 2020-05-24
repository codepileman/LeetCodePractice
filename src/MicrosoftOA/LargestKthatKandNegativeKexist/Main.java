package MicrosoftOA.LargestKthatKandNegativeKexist;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        int[] nums1 = { 3, 2, -2, 5, -3 };
        System.out.println(kExist(nums1));
    }

    public static int kExist(int[] nums){
        int res = 0;
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++) {
            set.add(-nums[i]);
            if(set.contains(nums[i])) {
                res = Math.max(res, Math.abs(nums[i]));
            }
        }
        return res;
    }
}
