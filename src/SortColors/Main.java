package SortColors;

public class Main {
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        sortColors(nums);
        for (int i = 0; i < nums.length ; i++) {
            System.out.println(nums[i]);
        }
    }
    public static void sortColors(int[] nums) {
        if(nums.length <=1 ){
            return;
        }
        int index = 0;
        int start = 0;
        int end = nums.length - 1;

        while(index <= end){
            if(nums[index] == 0){
                nums[index] = nums[start];
                nums[start] = 0;
                index++;
                start++;
            }else if(nums[index] == 2){
                nums[index] = nums[end];
                nums[end] = 2;
                end--;
            }else{
                index++;
            }
        }
    }
}
