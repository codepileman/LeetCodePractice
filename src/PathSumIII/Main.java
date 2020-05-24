package PathSumIII;
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
public class Main {
    public int pathSum(TreeNode root, int sum) {
        if(root == null) return 0;

        return helper(root, sum) + pathSum(root.left, sum) + pathSum(root.right, sum);

    }

    public int helper(TreeNode root, int sum){
        int counter = 0;

        if(root == null) return 0;

        if(root.val == sum){
            counter++;
        }

        counter += helper(root.left, sum - root.val);
        counter += helper(root.right, sum - root.val);

        return counter;


    }
}
