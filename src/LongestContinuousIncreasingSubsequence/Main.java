package LongestContinuousIncreasingSubsequence;

public class Main {
    public static void main(String[] args) {
        int[] nums = {2,2,2,2,2};
        System.out.println(findLengthOfLCIS(nums));
    }

    public static int findLengthOfLCIS(int[] nums) {
        if(nums.length == 0) return 0;

        int left = 0;
        int right = 0;
        int maxL = 0;

        while(right < nums.length - 1){
            if(nums[right] >= nums[right+1]){
                int len = right - left + 1;
          
                maxL = Math.max(maxL, len);
                left =  right + 1;
            }

            right++;
        }

        return maxL;

    }
}
