package SearchInsertPosition;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        System.out.println(searchInsert(nums, 0));
    }
    public static int searchInsert(int[] nums, int target) {
        if(nums == null || nums.length == 0){
            return 0;
        }

        if(nums.length == 1){
            if(target > nums[0]){
                return 1;
            }else{
                return 0;
            }
        }
        for (int i = 1; i <= nums.length - 1; i++) {
            if(target == nums[i-1] || ((i - 1) == 0 && target < nums[i - 1])){
                return i-1;
            }

            if((nums[i - 1] < target && nums[i] > target) || nums[i] == target){
                return i;
            }

        }

        return nums.length;
    }
}
