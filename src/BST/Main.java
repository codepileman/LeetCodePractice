package BST;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Tree intTree = new Tree();
//        for (int i = 0; i < 100; i++) {
//            intTree.insert(new Random().nextInt(100));
//        }

        intTree.insert(25);
        intTree.insert(20);
        intTree.insert(15);
        intTree.insert(27);
        intTree.insert(30);
        intTree.insert(29);
        intTree.insert(26);
        intTree.insert(22);
        intTree.insert(32);

        intTree.traversePreOrder();

//        intTree.traverseInOrder();

//        intTree.delete(25);

//        intTree.traverseInOrder();

//        System.out.println(intTree.get(15));
//        System.out.println(intTree.get(999));
//
        System.out.println(intTree.min());
        System.out.println(intTree.max());
    }
}