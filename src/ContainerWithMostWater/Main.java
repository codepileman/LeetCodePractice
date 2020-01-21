package ContainerWithMostWater;

public class Main {
    public static void main(String[] args) {
        int[] input = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        maxArea(input);
    }

    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;

        int maxArea = 0;
        int minHeight;


        while(left < right){
            minHeight = height[left] > height[right] ? height[right] : height[left];
            maxArea = (right - left)*minHeight > maxArea ? (right - left)*minHeight : maxArea;
            System.out.println(maxArea);
            System.out.println(left);
            System.out.println(right);

            if (height[left] > height[right]){
                right--;
            }else{
                left++;
            }
        }

        return maxArea;
    }
}
