package RemoveDuplicatesfromSortedArray;

public class Main {
    public static void main(String[] args) {
        int[] input = {0,0,1,1,1,2,2,3,3,4};
        int[] res = removeDuplicates(input);
        for (int i = 0; i < res.length ; i++) {
            System.out.println(res[i]);
        }
        System.out.println();
    }
    public static int[] removeDuplicates(int[] nums) {
        if (nums.length <=1){
//            return nums.length;
            return nums;
        }
        int i = 0;
        for (int j = 1; j < nums.length ; j++) {
            if(nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }

        return nums;
    }
}
