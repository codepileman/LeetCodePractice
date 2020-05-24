package KthLargestElementinanArray;

public class Main {


    public static void main(String[] args) {
        int[] nums = {3,2,1,5,6,4};
        System.out.println(findKthLargest(nums, 2));
    }


    public static int findKthLargest(int[] nums, int k) {
        if(nums == null || nums.length == 0 || k <= 0) return 0;

        int left = 0;
        int right = nums.length - 1;
        int targetK = nums.length - k;

        while(left <= right){
            int pivotIndex = partition(nums, left, right);
            if(targetK == pivotIndex){
                return nums[pivotIndex];
            }else if(targetK < pivotIndex){
                right = pivotIndex - 1;
            }else{
                left = pivotIndex + 1;
            }
        }

        return 0;
    }

    private static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private static int partition(int[] nums, int left, int right){
        int pivot = right;
        int slow = left - 1;
        int fast = left;

        while(fast < pivot){
            if(nums[fast] > nums[pivot]) {
                fast++;
            }
            else{
                slow++;
                swap(nums, fast, slow);
                fast++;
            }
        }
        slow++;
        swap(nums, slow, pivot);
        return slow;
    }
}
