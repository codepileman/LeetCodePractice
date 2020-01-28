package MergeIntervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};

        System.out.println(merge(intervals));
    }
    public static int[][] merge(int[][] intervals) {
        if(intervals.length <= 1){
            return intervals;
        }

        Arrays.sort(intervals, (arr1, arr2) -> Integer.compare(arr1[0], arr2[0]));

        List<int[]> res = new ArrayList<>();

        int i = 0;
        int[] currentInterval = intervals[0];
        while(i <= intervals.length - 1){
            if(currentInterval[1] >= intervals[i][0]){
                currentInterval = new int[]{currentInterval[0], Math.max(currentInterval[1], intervals[i][1])};
            }else{
                res.add(currentInterval);
                currentInterval = intervals[i];
            }
            i++;
        }
        res.add(currentInterval);
        return res.toArray(new int[res.size()][]);
    }
}
