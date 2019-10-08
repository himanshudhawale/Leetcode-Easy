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
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root==null) return false;
        Stack<TreeNode> st = new Stack<>();
        Stack<Integer> sum_st = new Stack<>();
        
        st.push(root);
        sum_st.push(sum-root.val);
        
        while(!st.isEmpty())
        {
            TreeNode node = st.pop();
            int curr = sum_st.pop();
            if((node.right == null) && (node.left==null) && (curr==0))
            {
                return true;
            }
            if(node.right!=null)
            {
                st.push(node.right);
                sum_st.push(curr - node.right.val);
                
            }
            if(node.left!=null)
            {
                st.push(node.left);
                sum_st.push(curr-node.left.val);
            }
        }
        return false;
        
//         if(root==null) return false;
        
//         sum = sum - root.val;
//         if(root.right==null && root.left==null)
//             return sum==0;
        
//         return hasPathSum(root.left,sum) || hasPathSum(root.right,sum);
    }
}