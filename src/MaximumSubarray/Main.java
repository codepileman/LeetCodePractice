package MaximumSubarray;

public class Main {
    public static void main(String[] args) {
        int[] nums = {9999,-10,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
    public static int maxSubArray(int[] nums) {

        if (nums.length == 0 || nums == null){
            return 0;
        }

        if(nums.length == 1){
            return nums[0];
        }
        //dynamic programming
        int cumulativeSum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if(cumulativeSum > 0){
                cumulativeSum = cumulativeSum + nums[i];
            } else {
                cumulativeSum = nums[i];
            }

            if (cumulativeSum > maxSum){
                maxSum = cumulativeSum;
            }

        }

        return maxSum;
    }
}
