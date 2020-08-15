package DesignHitCounter;

import java.util.LinkedList;
import java.util.Queue;

class HitCounter {
    Queue<Integer> queue;
    public HitCounter(){
        queue = new LinkedList();
    }

    public void hit(int timestamp){
        queue.offer(timestamp);
    }

    public int getHits(int timestamp){
        while(!queue.isEmpty() && timestamp - queue.peek() >= 300){
            queue.poll();
        }

        return queue.size();
    }
}
