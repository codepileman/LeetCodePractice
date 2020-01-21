package NextPermutation;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {4, 9, 5, 4, 3, 2, 1};
        nextPermutation(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
    public static void nextPermutation(int[] nums) {
        if(nums.length == 1 || nums == null){
            return;
        }
        boolean descending = true;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] > nums[i-1]){
                descending = false;
            }
        }

        if(descending){
            Arrays.sort(nums);
            return;
        }


        int i = nums.length - 1;
        while(i >= 1 && nums[i] <= nums[i-1]){
            i--;
        }

        int j = nums.length - 1;
        while(j >=0 && nums[j] <= nums[i-1]){
            j--;
        }

        swap(nums, i-1, j);


        reverse(nums, i, nums.length-1);

    }

    public static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void reverse(int[] nums, int from, int to){
        int i = from, j = to;
        while(i < j){
            swap(nums, i, j);
            i++;
            j--;
        }

    }
}
