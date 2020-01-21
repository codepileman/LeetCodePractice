package ZigZagConversion;

public class Main {

    public static void main(String[] args) {
        System.out.println(convert("PAYPALISHIRING", 4));

    }

    public static String convert(String s, int numRows) {
        if(s.length() == 1 || s.length() == 0 || numRows == 1){
            return s;
        }

        boolean goUp =  false;
        String res[] = new String[numRows];

        for (int i = 0; i < res.length; i++) {
            res[i] = "";
        }

        int i = 0;
        int j = 0;
        while(j < s.length()){
            res[i] += s.charAt(j);
            if(i == numRows - 1){
                goUp = true;
            }

            if (i == 0){
                goUp = false;
            }
            if (goUp){
                i--;
            }else{
                i++;
            }

            j++;
        }


        StringBuilder all = new StringBuilder();
        for(String ss : res){
            all.append(ss);
        }

        return all.toString();
    }
}
