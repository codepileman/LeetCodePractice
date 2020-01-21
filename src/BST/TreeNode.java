package BST;

public class TreeNode {
    private int data;
    private TreeNode leftChild;
    private TreeNode rightChild;

    public TreeNode(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public TreeNode getLeftChild() {
        return leftChild;
    }

    public TreeNode getRightChild() {
        return rightChild;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }

    public void insert(int value){
        if(this.data == value){
            return;
        }
        if (value < this.data){
            if(leftChild == null){
                leftChild = new TreeNode(value);
            }else{
                leftChild.insert(value);
            }

        }else{
            if(rightChild == null){
                rightChild = new TreeNode(value);
            }else{
                rightChild.insert(value);
            }

        }
    }

    public TreeNode get(int value){
        if(this.data == value){
            return this;
        }

        if (value < this.data){
            if(leftChild != null){
                return leftChild.get(value);
            }
        }else{
            if(rightChild != null){
                return rightChild.get(value);
            }

        }

        return null;

    }

    public int min(){
        if(leftChild == null){
            return data;
        }

        return leftChild.min();
    }

    public int max(){
        if(rightChild == null){
            return data;
        }
        return rightChild.max();
    }

    public void traverseInOrder(){
        if(leftChild != null){
            leftChild.traverseInOrder();
        }
        System.out.println("Data is " + this.data);

        if(rightChild != null){
            rightChild.traverseInOrder();
        }
    }

    public void traversePreOrder(){
        System.out.println("Data is " + this.data);
        if(leftChild != null){
            leftChild.traversePreOrder();
        }

        if(rightChild != null){
            rightChild.traversePreOrder();
        }
    }

    @Override
    public String toString(){
        return "Data = " +  this.data;
    }


}
