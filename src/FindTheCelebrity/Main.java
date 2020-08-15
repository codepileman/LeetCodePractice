package FindTheCelebrity;

public class Main {
    //https://www.youtube.com/watch?v=LZJBZEnoYLQ
    public boolean knows(int a, int b){
        return true;
    }

    public int findCelebrity(int n){
        int candidate = 0;
        for (int i = 1; i < n ; i++) {
            if(knows(candidate, i)){
                candidate = i;
            }
        }

        //在loop一遍，检查candidate是不是有效
        for (int i = 0; i < n; i++) {
            if(i != candidate && knows(candidate, i) || !knows(i, candidate)){
                return -1;
            }
        }

        return candidate;
    }
}
