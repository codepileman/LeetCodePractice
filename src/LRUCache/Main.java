package LRUCache;

import java.util.HashMap;

//explanation: https://leetcode.com/problems/lru-cache/discuss/531660/Java-or-double-linked-list-or-hashmap-or-O(1)-time-or-fast-or-easy-or-detail

class Node {
    Node prev;
    Node next;
    int key;

    public Node(Node prev, Node next, int key) {
        this.prev = prev;
        this.next = next;
        this.key = key;
    }
}


class LRUCache {
    HashMap<Integer, Integer> valMap;
    HashMap<Integer, Node> nodeMap;
    int nofItem;
    int maxCap;
    Node head;
    Node tail;

    public LRUCache(int capacity) {
        valMap = new HashMap<>();
        nodeMap = new HashMap<>();
        nofItem = 0;
        maxCap = capacity;
        head = new Node(null, tail, 0);
        tail = new Node(head, null, 0);
    }

    public int get(int key) {
        // System.out.println("get key="+key);
        Integer storedVal = valMap.get(key);
        if (storedVal != null) {
            Node oNode = nodeMap.get(key);
            removeFromList(oNode);
            addToList(oNode);
            return storedVal;
        } else {
            return -1;
        }

    }

    public void put(int key, int value) {
        Integer storedVal = valMap.get(key);
        if (storedVal != null) {
            Node oNode = nodeMap.get(key);
            removeFromList(oNode);
        } else {
            nofItem++;
            if (nofItem > maxCap) removeFirst();
        }
        Node nNode = new Node(null, null, key);
        valMap.put(key, value);
        nodeMap.put(key, nNode);
        addToList(nNode);
    }


    private void addToList(Node node) {
        Node oTail = tail.prev;
        oTail.next = node;
        node.prev = oTail;
        node.next = tail;
        tail.prev = node;
    }

    private void removeFromList(Node node) {
        Node prevNode = node.prev;
        Node nextNode = node.next;
        prevNode.next = nextNode;
        nextNode.prev = prevNode;
    }

    private void removeFirst() {
        nodeMap.remove(head.next.key);
        valMap.remove(head.next.key);
        removeFromList(head.next);
        nofItem--;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
