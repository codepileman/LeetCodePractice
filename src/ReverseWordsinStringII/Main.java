package ReverseWordsinStringII;

public class Main {
    public static void main(String[] args) {
        char[] arr = {'t', 'h', 'e', ' ', 's', 'k', 'y', ' ', 'i', 's', ' ', 'b', 'l', 'u', 'e'};
        solution(arr);
        for(char c : arr){
            System.out.print(c);
        }
    }

    public static void solution(char[] arr){
        int i = 0;
        int j = 0;

        while(i < arr.length){
            if(arr[i] == ' ' ){
                reverse(j, i-1, arr);
                i++;
                j=i;
            }else if(i == arr.length-1){
                reverse(j, i, arr);
                i++;
            }else{
                i++;
            }

        }

        reverse(0, arr.length-1, arr);

    }

    public static void reverse(int left, int right, char[] arr){
        while(left < right){
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

    }
}
