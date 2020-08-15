package InorderSuccessorinBSTII;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode parent;
    TreeNode(int val) {this.val = val;};
}


public class Main {
    public TreeNode inorderSuccessor(TreeNode p){
        if(p == null) return null;
        TreeNode res = null;
        if(p.right != null){
            res = p.right;
            while(res != null){
                res = res.left;
            }
        }else{
            res = p.parent;
            while(res != null && res.val < p.val){
                res = res.parent;
            }
        }


        return res;
    }
}
