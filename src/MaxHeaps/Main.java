package MaxHeaps;

import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        Heap heap = new Heap(10);
        heap.insert(80);
        heap.insert(75);
        heap.insert(60);
        heap.insert(68);
        heap.insert(55);
        heap.insert(40);
        heap.insert(52);
        heap.insert(67);

        heap.printHeap();
        heap.sort();
        heap.printHeap();
//
////        heap.delete(0);
////        heap.printHeap();
//        System.out.println(heap.peek());


//        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
//
//        pq.add(25);
//        pq.add(-22);
//        pq.add(1343);
//        pq.add(54);
//        pq.add(0);
//        pq.add(-3492);
//        pq.add(429);
//        System.out.println(pq.peek());
//        pq.remove();
//        System.out.println(pq.peek());

    }
}
