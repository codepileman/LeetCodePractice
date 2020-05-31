package MicrosoftOA.CropWords;

public class Main {
    public static void main(String[] args) {
        System.out.println(solution("Codility we test coders", 14));
        System.out.println(solution(" ", 3));
        System.out.println(solution(" c ", 3));
    }

    public static String solution(String s, int k){
        if(s.length() == 0) return "";

        String[] arr= s.split(" ");
        if(arr.length == 0) return "";

        StringBuilder res = new StringBuilder();
        int i = 0;
        while(i < arr.length && res.length() <= k){
            if(res.length() + arr[i].length() > k){
                if(i == 0){ //the first word already larger than k
                    return res.toString();
                }else{//not the first word, need to remove ending space
                    res.deleteCharAt(res.length()-1);
                    return res.toString();
                }
            }else{
                res.append(arr[i]);
                res.append(" ");
                i++;
            }

        }
        if(res.charAt(res.length() - 1) == ' ') res.deleteCharAt(res.length()-1);

        return res.toString();
    }
}
