package MicrosoftOA.Riddle;

public class Main {
    public static void main(String[] args) {
        System.out.println(solution("ab?ac"));
    }

    public static String solution(String s){
        char[] arr = s.toCharArray();

        for(int i=0; i < arr.length; i++){
            if(arr[i] == '?'){
                char prev = '?';
                char post = '?';
                if(i > 0){
                    prev = arr[i-1];
                }
                if(i < arr.length-1){
                    post = arr[i+1];
                }

                char choice = 'a';
                while((choice == prev || choice == post) && choice <='z'){
                    choice = (char) (choice + 1);
                }

                arr[i] = choice;
            }
        }
        return new String(arr);
    }
}
