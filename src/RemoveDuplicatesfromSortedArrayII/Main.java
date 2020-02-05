package RemoveDuplicatesfromSortedArrayII;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 3, 5, 5, 7};
        System.out.println(removeDuplicates(nums));
    }
    public static int removeDuplicates(int[] nums) {
        if(nums.length <= 1){
            return nums.length;
        }
        int n = nums.length;
        int j = 0;
        for (int i = 0; i < n; i++) {
            if(i < n - 2 && nums[i] == nums[i+2]){
                continue;
            }

            nums[j++] = nums[i];

        }

        return j;
    }
}
