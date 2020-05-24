package MicrosoftOA.MinAdjSwapstoMakePalindrome;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println(noOfSwaps("mamad"));;
    }

    public static int noOfSwaps(String s){
        //scan first
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0) + 1);
        }

        int oddNums = 0;
        for(Character c : map.keySet()){
            if(map.get(c) % 2 != 0){
                oddNums++;
            }
        }

        if(oddNums > 1) return -1;

        int numOfSwap = 0;
        int p1 = 0;
        int p2 = s.length() - 1;
        char[] charArr = s.toCharArray();


        while(p2 > p1){
            if(charArr[p1] != charArr[p2]){
                int k = p2;
                while(p1 < k && charArr[p1] != charArr[k]) k--;

                if(p1 == k){
                    swap(charArr, p1, p1+1);
                    numOfSwap++;
                }else{
                    while(k < p2){
                        swap(charArr, k, k+1);
                        k++;
                        numOfSwap++;
                    }

                    p1++;
                    p2--;
                }
            }else{
                p1++;
                p2--;
            }
        }
        return numOfSwap;

    }

    public static void swap(char[] charArr, int index1, int index2){
        char c = charArr[index1];
        charArr[index1] = charArr[index2];
        charArr[index2] = c;
    }
}
