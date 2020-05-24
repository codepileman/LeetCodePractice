package MeetingRoomII;

import java.util.Arrays;
import java.util.PriorityQueue;

class Interval {
        int start, end;
        Interval(int start, int end) {
        this.start = start;
        this.end = end;
        }
}

public class Main {
    public int minMeetingRooms(Interval[] intervals) {
        if(intervals == null || intervals.length == 0) return 0;

        Arrays.sort(intervals, (a , b) -> a.start - b.start);

        PriorityQueue<Interval> pq = new PriorityQueue<>((a, b) -> a.end - b.end);

        pq.add(intervals[0]);
        for (int i = 1; i < intervals.length; i++) {
            Interval earliest = pq.remove(); //remove the item with smallest end in pq
            if(intervals[i].start >= earliest.end){
                earliest = intervals[i];
            }else{
                pq.add(intervals[i]);
            }

            pq.add(earliest);
        }

        return pq.size();

    }
}
