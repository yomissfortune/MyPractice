package eazy;

/**
 * Created by Administrator on 2018/1/3.
 */
public class MergeTwoBinaryTrees617 {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode(int x) { val = x; }
     * }
     */
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        //如果t1 t2不存在一个,返回另一个，返回
        if(t1==null ){
            return t2;
        }
        if(t2 == null ){
            return t1;
        }
        TreeNode node = new TreeNode(t1.val + t2.val);
        node.left = mergeTrees(t1.left,t2.left);
        node.right = mergeTrees(t1.right,t2.right);
        return node;
    }


}
