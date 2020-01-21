package MaxHeaps;

public class Heap {

    private int[] heap;
    private int size;

    public Heap(int capacity){
        heap = new int[capacity];
    }

    public void insert(int value){
        if (isFull()){
            throw new IndexOutOfBoundsException("Heap is full");
        }
        heap[size] = value;

        fixHeapAbove(size);
        size++;

    }

    public int peek(){
        if(isEmpty()){
            throw new IndexOutOfBoundsException("heap is empty");
        }

        return heap[0];
    }

    public void sort(){
        //swap the root with the heap's last elements
        for (int i = size-1; i > 0 ; i--) {
            int tmp = heap[0];
            heap[0] = heap[i];
            heap[i] = tmp;
            fixHeapBelow(0, i - 1);
        }
    }

    public int delete(int index){
        if(isEmpty()){
            throw new IndexOutOfBoundsException("Heap is empty");
        }

        int parent = getParent(index);
        int deleteValue = heap[index];

        heap[index] = heap[size-1];

        if(index == 0 || heap[index] < heap[parent]){
            fixHeapBelow(index, size-1);
        }else{
            fixHeapAbove(index);
        }

        size--;

        return deleteValue;

    }

    public void printHeap(){
        for (int i = 0; i < size; i++) {
            System.out.print(heap[i]);
            System.out.print(',');

        }
        System.out.println();
    }

    public void fixHeapAbove(int index){
        int newValue = heap[index];
        while(index > 0 && heap[index] > heap[getParent(index)]){
            heap[index] = heap[getParent(index)];
            index = getParent(index);
        };

        heap[index] = newValue;
    }

    public void fixHeapBelow(int index, int lastHeapIndex){
        int childToSwap;

        while (index <= lastHeapIndex ){
            int leftChild = getChild(index, true);
            int rightChild = getChild(index, false);

            if (leftChild <= lastHeapIndex){
                if (rightChild > lastHeapIndex){
                    childToSwap = leftChild;
                }else {
                    childToSwap = (heap[leftChild] > heap[rightChild] ? leftChild : rightChild);
                }

                if (heap[index] < heap[childToSwap]){
                    int tmp = heap[index];
                    heap[index] = heap[childToSwap];
                    heap[childToSwap] = tmp;
                }
                else{
                    break;
                }

                index = childToSwap;

            }else {
                break;
            }
        }
    }

    public boolean isFull(){
        return size == heap.length;
    }

    public int getParent(int index){
        return (index - 1) / 2;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public int getChild(int index, boolean left){
        return 2 * index + (left ? 1 : 2);
    }
}
