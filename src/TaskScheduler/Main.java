package TaskScheduler;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

    }


    public int leastInterval(char[] tasks, int n) {
        int[] map = new int[26];
        for(char c : tasks){
            map[c-'A']++;
        }
        Arrays.sort(map);

        int maxInteval = map[25] - 1;
        int slots = maxInteval * n;

        for(int i = 24; i >= 0; i--){
            slots -= Math.min(map[i], maxInteval);
        }

        return slots > 0 ? slots + tasks.length : tasks.length;

    }
}
