package SubarrayProductLessThanK;

public class Main {
    public static int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k == 0) return 0;
        int min = nums[0];
        for(int num : nums){
            if(num < min) min = num;
        }
        if(min >= k) return 0;

        int left = 0;
        int right = 0;
        int prod = 1;
        int res = 0;

        while(right < nums.length){
            if(nums[right] <= k){
                prod *= nums[right];

                while(prod >= k){
                    prod /= nums[left];
                    left++;
                }

                res += right - left + 1;

            }
            right++;


        }

        return res;
    }

    public static void main(String[] args) {
        int[] nums = new int[47219];
        for(int i = 0; i<47219; i++){
            nums[i] = 1;
        }
        System.out.println(numSubarrayProductLessThanK(nums, 5));
    }
}
