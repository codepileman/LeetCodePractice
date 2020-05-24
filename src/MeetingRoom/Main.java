package MeetingRoom;

import java.util.Arrays;
import java.util.concurrent.ArrayBlockingQueue;

class Interval {
    int start, end;
    Interval(int start, int end) {
        this.start = start;
        this.end = end;
    }
}

public class Main {
    public boolean canAttendMeetings(Interval[] intervals){
        if(intervals == null || intervals.length == 0) return true;

        int[] start = new int[intervals.length];
        int[] end = new int[intervals.length];

        for (int i = 0; i < intervals.length; i++) {
            start[i] = intervals[i].start;
            end[i] = intervals[i].end;
        }

        Arrays.sort(start);
        Arrays.sort(end);

        for (int i = 1; i < start.length ; i++) {
            if(end[i-1] > start[i]){
                return false;
            }
        }

        return true;
    }
}
