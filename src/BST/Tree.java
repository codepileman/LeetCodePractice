package BST;

public class Tree {
    public TreeNode root;
    public void insert(int value){
        if(root == null){
            root = new TreeNode(value);
        } else{
            root.insert(value);
        }
    }

    public void traverseInOrder(){
        if(root != null){
            root.traverseInOrder();
        }
    }

    public void traversePreOrder(){
        if(root != null){
            root.traversePreOrder();
        }
    }

    public TreeNode get(int value){
        if(root != null){
            return root.get(value);
        }

        return null;
    }

    public void delete(int value){
        root = delete(root, value);
    }

    private TreeNode delete(TreeNode subTreeRoot, int value){
        if(subTreeRoot == null){
            return null;
        }
        if(value < subTreeRoot.getData()){
            subTreeRoot.setLeftChild(delete(subTreeRoot.getLeftChild(), value));
        }else if (value > subTreeRoot.getData()){
            subTreeRoot.setRightChild(delete(subTreeRoot.getRightChild(), value));
        } else {
            //node to be deleted has 0 or 1 child
            if (subTreeRoot.getLeftChild() == null){
                return subTreeRoot.getRightChild();
            }else if(subTreeRoot.getRightChild() == null){
                return subTreeRoot.getLeftChild();
            }

            //node to be deleted has two children
            //replace the value with the smallest value in right subtree
            subTreeRoot.setData(subTreeRoot.getRightChild().min());

            //
            subTreeRoot.setRightChild(delete(subTreeRoot.getRightChild(), subTreeRoot.getData()));


        }

        return subTreeRoot;

    }

//    public int min(){
//        TreeNode currentNode = root;
//        int min = root.getData();
//        while(currentNode != null){
//            min = currentNode.getData();
//            currentNode = currentNode.getLeftChild();
//        }
//
//        return min;
//    }

    public int min(){
        if(root == null){
            return Integer.MIN_VALUE;
        }

        return root.min();
    }

    public int max(){
        if(root == null){
            return Integer.MAX_VALUE;
        }

        return root.max();
    }





}
