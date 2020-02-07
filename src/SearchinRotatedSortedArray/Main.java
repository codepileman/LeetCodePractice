package SearchinRotatedSortedArray;

public class Main {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        search(nums, 0);
    }
    public static int search(int[] nums, int target) {
        if(nums == null  || nums.length == 0){
            return -1;
        }
        //first use modified bst to find the min number
        int left = 0;
        int right = nums.length - 1;
        while(left < right){
            int mid = left + (right - left) / 2;
            if(nums[mid] > nums[right]){
                left = mid + 1;
            }else{
                right = mid;
            }
        }

        //min number is at left (left equals to right now);
        //decide which part to search the target
        int start = left;
        left = 0;
        right = nums.length - 1;
        if(target >= nums[start] && target <= nums[right]){
            left = start;
        }else{
            right = start;
        }

        //then bst on the part
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(nums[mid] == target){
                return mid;
            }

            if(nums[mid] > target){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }

        return -1;


    }
}
