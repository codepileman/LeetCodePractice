package SearchinRotatedSortedArrayII;

public class Main {

    public static void main(String[] args) {
        int[] nums = {2,5,6,0,0,1,2};
        System.out.println(search(nums, 3));
    }
    //思路就是根据mid和start的比较，看出rotate点在那半边，然后先判断没有rotate那半部分，如果没有的话，再二分有rotate点的半部分
    public static boolean search(int[] nums, int target) {

        if(nums.length == 0 || nums == null){
            return false;
        }

        int start = 0;
        int end = nums.length - 1;
        while(start < end){
            int mid = start + (end - start) / 2;
            if(nums[mid] == target){
                return true;
            }
            if(nums[mid] > nums[start]){
                if(nums[mid] >= target && nums[start] <= target){
                    end = mid;
                }else{
                    start = mid;
                }
            }else if(nums[mid] < nums[start]){
                if(nums[mid]<=target && nums[end] >= target){
                    start = mid;
                }else{
                    end = mid;
                }
            }else {
                start++;
            }

        }
        if(nums[start] == target || nums[end] == target) return true;
        return false;


    }
}
