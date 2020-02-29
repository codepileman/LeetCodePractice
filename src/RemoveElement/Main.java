package RemoveElement;

public class Main {
    public int removeElement(int[] nums, int val) {
        if(nums.length == 0){
            return 0;
        }

        if(nums.length == 1 && nums[0] != val){
            return 1;
        }

        if(nums.length == 1 && nums[0] == val){
            return 0;
        }
        int i = 0;

        for(int j=0; j< nums.length; j++){
            if(nums[j] != val){
                nums[i] = nums[j];
                i++;
            }
        }

        return i;
    }
}
