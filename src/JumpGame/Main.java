package JumpGame;

import java.util.Arrays;

public class Main {
    public static boolean canJump(int[] nums) {
        if(nums.length <= 1 || nums == null) {
            return true;
        }
        boolean[] res = new boolean[nums.length];
        Arrays.fill(res, false);
        res[nums.length - 1] = true;

        for(int i = nums.length - 2; i >= 0; i--) {
            int furtherJumps = nums.length - 1 > i+ nums[i]?  i+ nums[i] : nums.length - 1;

            for(int j = i + 1; j <= furtherJumps; j++) {
                if(res[j]) {
                    res[i] = true;
                    break;
                }
            }
        }

        return res[0];

    }
}
