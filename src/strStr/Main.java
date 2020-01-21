package strStr;

public class Main {

    public int strStr(String haystack, String needle) {
        if(needle == null || haystack == null){
            return -1;
        }

        if(needle.equals("") && haystack.equals("")){
            return 0;
        }


        int j = 0;

        for(int i=0; i<haystack.length(); i++){
            int temp = i;
            while(j < needle.length()){

                if(needle.charAt(j) == haystack.charAt(i) && needle.length() - j <= haystack.length() - i){
                    j++;
                    i++;
                }else{
                    j=0;
                    i=temp;
                    break;
                }

            }
            if(j == needle.length()){
                return i-j;
            }


        }

        return -1;
    }
}
