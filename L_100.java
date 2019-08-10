/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        //First check if both are null
        if(p==null && q==null)
            return true;
        //Then check if one of them is null
        if(p==null || q==null)
            return false;
        //Check if values are different
        if(p.val!=q.val)
            return false;
        //All cases are checked so return
        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }
}