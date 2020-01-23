package FindFirstandLastPositionofElementinSortedArray;

public class Main {
    public int[] searchRange(int[] nums, int target) {
        int[] res = {-1, -1};
        res[0] = findFirst(nums, 0, nums.length-1, target);
        res[1] = findLast(nums, 0, nums.length-1, target);
        return res;
    }
    public static int findFirst(int nums[], int low, int high, int target) {
        if (low > high) {
            return -1;
        }
        int mid = low + (high - low) / 2;
        if((mid == 0 || nums[mid-1]< target) && nums[mid] == target) {
            return mid;
        } else if(target > nums[mid]){
            return findFirst(nums, mid+1, high, target);
        }else {
            return findFirst(nums, low, mid-1, target);
        }
    }

    public static int findLast(int nums[], int low, int high, int target) {
        if (low > high) {
            return -1;
        }
        int mid = low + (high - low) / 2;
        if((mid == nums.length - 1 || nums[mid+1] > target) && nums[mid] == target) {
            return mid;
        } else if(target < nums[mid]){
            return findLast(nums, low, mid-1, target);

        }else {
            return findLast(nums, mid+1, high, target);
        }
    }
}
