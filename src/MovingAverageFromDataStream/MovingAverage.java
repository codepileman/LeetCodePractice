package MovingAverageFromDataStream;

import java.util.LinkedList;
import java.util.Queue;

public class MovingAverage {
    Queue<Integer> queue;
    int size;
    double sum;

    public MovingAverage(int size){
        this.queue = new LinkedList();
        this.size = size;
        this.sum = 0.0;
    }

    public double next(int val){
        if(queue.size() == size){
            sum -= queue.remove();
        }

        queue.offer(val);
        sum += val;
        return sum / queue.size();
    }


}
